package kelvineduardo.projetoSpringBoot.repositories;
import org.springframework.data.jpa.repository.JpaRepository;

import kelvineduardo.projetoSpringBoot.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {

}