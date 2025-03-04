package com.webcourse.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.webcourse.course.entities.Product;


public interface ProductRepository extends JpaRepository<Product, Long> {
	

}
