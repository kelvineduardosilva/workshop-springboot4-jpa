package kelvineduardo.projetoSpringBoot.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kelvineduardo.projetoSpringBoot.entities.Product;
import kelvineduardo.projetoSpringBoot.services.ProductService;

@RestController
@RequestMapping(value = "/products")
public class ProductResource {
	
	@Autowired
	private ProductService service;

	@GetMapping
	public ResponseEntity<List<Product>> findAll(){
		List<Product> list = service.findAll();
		return ResponseEntity.ok().body(list);
	}
	@GetMapping(value="/{id}")
	public Product findById(@PathVariable Long id){
		Product product = service.findById(id);
		return product; //Podemos retornar direto dessa forma porem eu tenho menos controle da resposta http.
	}
}
