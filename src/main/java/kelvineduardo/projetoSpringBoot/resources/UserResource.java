package kelvineduardo.projetoSpringBoot.resources;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kelvineduardo.projetoSpringBoot.entities.User;

@RestController
@RequestMapping(value = "/users")
public class UserResource {

	@GetMapping
	public ResponseEntity<User> findAll(){
		User u = new User(1, "Maria", "maria@gmail.com", "16997781421", "123");
		return ResponseEntity.ok().body(u);
	}
}
