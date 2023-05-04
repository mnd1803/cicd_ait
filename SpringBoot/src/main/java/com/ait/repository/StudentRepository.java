package com.ait.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ait.model.Student;

public interface StudentRepository extends JpaRepository <Student, Integer>{

		Student findByName(String name);
}
