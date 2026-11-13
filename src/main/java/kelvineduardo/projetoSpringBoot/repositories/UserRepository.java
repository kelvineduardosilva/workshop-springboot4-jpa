package kelvineduardo.projetoSpringBoot.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import kelvineduardo.projetoSpringBoot.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
