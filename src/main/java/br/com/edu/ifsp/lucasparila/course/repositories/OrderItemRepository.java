package br.com.edu.ifsp.lucasparila.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.edu.ifsp.lucasparila.course.entities.OrderItem;
import br.com.edu.ifsp.lucasparila.course.entities.pk.OrderItemPK;

public interface OrderItemRepository extends JpaRepository<OrderItem, OrderItemPK> {	
}
