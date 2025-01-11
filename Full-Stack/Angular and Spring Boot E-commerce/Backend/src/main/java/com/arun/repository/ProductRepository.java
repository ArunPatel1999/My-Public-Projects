package com.arun.repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestParam;

import com.arun.entitys.Product;

@CrossOrigin
//@RepositoryRestResource(collectionResourceRel = "product", path = "product")
public interface ProductRepository extends JpaRepository<Product, Long> {
	
	Page<Product> findByCategoryId(@RequestParam("id") Long id, Pageable pageable);

	Page<Product> findByNameContainingIgnoreCase(@RequestParam("keyword") String keyword, Pageable pageable);
	
}
