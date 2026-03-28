package br.com.edu.ifsp.lucasparila.course.services;
import br.com.edu.ifsp.lucasparila.course.entities.*;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.edu.ifsp.lucasparila.course.repositories.ProductRepository;

@Service
public class ProductService {
	
		@Autowired 
		private ProductRepository repository;
		
		public List<Product> findAll(){
			return repository.findAll();
		}
		
		public Product findById(Long id) {
			Optional<Product> obj = repository.findById(id);
			return obj.get();
		}
}
