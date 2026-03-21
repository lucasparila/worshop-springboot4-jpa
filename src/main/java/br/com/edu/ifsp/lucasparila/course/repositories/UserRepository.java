package br.com.edu.ifsp.lucasparila.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.edu.ifsp.lucasparila.course.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {
	
}
