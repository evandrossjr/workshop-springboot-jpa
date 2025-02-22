package com.webcourse.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.webcourse.course.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {
	

}
