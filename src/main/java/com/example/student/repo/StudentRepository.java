package com.example.student.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.example.student.entity.Students;
@Repository
public interface StudentRepository extends JpaRepository<Students, Integer> {
	
	

	
	

}
