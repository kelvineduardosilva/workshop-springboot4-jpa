package kelvineduardo.projetoSpringBoot.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kelvineduardo.projetoSpringBoot.entities.Category;
import kelvineduardo.projetoSpringBoot.entities.Product;
import kelvineduardo.projetoSpringBoot.repositories.ProductRepository;

@Service
public class ProductService {
	
	@Autowired
	private ProductRepository repository;
	
	public List<Product> findAll(){
		return repository.findAll();
	}
	public Product findById(Long id) {
		Optional<Product> obj = repository.findById(id);
		
		if(obj.isPresent()) {
			return obj.get();
		}
		throw new RuntimeException("Categoria não encontrada");
	}

}
