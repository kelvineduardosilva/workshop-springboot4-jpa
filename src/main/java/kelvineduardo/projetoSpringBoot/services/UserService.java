package kelvineduardo.projetoSpringBoot.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kelvineduardo.projetoSpringBoot.entities.User;
import kelvineduardo.projetoSpringBoot.repositories.UserRepository;

@Service
public class UserService {
	
	@Autowired
	private UserRepository repository;
	
	public List<User> findAll(){
		return repository.findAll();
	}
	public User findById(Long id) {
		Optional<User> obj = repository.findById(id);
		
		if(obj.isPresent()) {
			return obj.get();
		}
		throw new RuntimeException("Usuário não encontrado");
	}

}
