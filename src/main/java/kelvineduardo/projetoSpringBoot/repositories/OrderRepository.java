package kelvineduardo.projetoSpringBoot.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import kelvineduardo.projetoSpringBoot.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {

}
