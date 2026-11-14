package kelvineduardo.projetoSpringBoot.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kelvineduardo.projetoSpringBoot.entities.Category;
import kelvineduardo.projetoSpringBoot.entities.User;
import kelvineduardo.projetoSpringBoot.repositories.CategoryRepository;

@Service
public class CategoryService {
	
	@Autowired
	private CategoryRepository repository;
	
	public List<Category> findAll(){
		return repository.findAll();
	}
	public Category findById(Long id) {
		Optional<Category> obj = repository.findById(id);
		
		if(obj.isPresent()) {
			return obj.get();
		}
		throw new RuntimeException("Categoria não encontrada");
	}

}
