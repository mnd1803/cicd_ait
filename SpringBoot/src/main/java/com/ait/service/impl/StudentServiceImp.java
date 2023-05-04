package com.ait.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ait.model.Student;
import com.ait.repository.StudentRepository;
import com.ait.service.StudentService;
@Service
public class StudentServiceImp  implements StudentService{

	@Autowired StudentRepository studentRepository;
	@Override
	public Student getById(int id) {
		Student s = studentRepository.findById(id).orElse(null); 
				return s;
	}

	@Override
	public Student getByName(String name) {
		Student s = studentRepository.findByName(name);
		return s;
	}

	@Override
	public boolean save(Student student) {
	//	System.out.println("id-" + student.getId()+ " , name-" + student.getName()+ ", mobileNo-" + student.getMobileNo());
		studentRepository.save(student);
		return false;
	}

}
