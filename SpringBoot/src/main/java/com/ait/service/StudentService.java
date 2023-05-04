package com.ait.service;

import com.ait.model.Student;

public interface StudentService {
	
	Student getById(int id);
	Student getByName(String name);
	boolean save (Student student);
	
	

}
