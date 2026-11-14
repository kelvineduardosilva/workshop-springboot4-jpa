package kelvineduardo.projetoSpringBoot.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kelvineduardo.projetoSpringBoot.entities.Category;
import kelvineduardo.projetoSpringBoot.entities.User;
import kelvineduardo.projetoSpringBoot.services.CategoryService;

@RestController
@RequestMapping(value = "/categories")
public class CategoryResource {
	
	@Autowired
	private CategoryService service;

	@GetMapping
	public ResponseEntity<List<Category>> findAll(){
		List<Category> list = service.findAll();
		return ResponseEntity.ok().body(list);
	}
	@GetMapping(value="/{id}")
	public Category findById(@PathVariable Long id){
		Category category = service.findById(id);
		return category; //Podemos retornar direto dessa forma porem eu tenho menos controle da resposta http.
	}
}
