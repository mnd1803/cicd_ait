package com.ait.model;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;



public class StudentTest {
	
	private Student student;
	
	@BeforeEach
	public void setUp() {
		student = new Student();
	}
	
	@Test
	void TestStudentName(){
		student.setName("Mandar");
		assertEquals( "Mandar" ,student.getName());
	}
	
	@Test
	void TestStudentID() {
		student.setId(1);
		assertEquals (1, student.getId());
	}
	
	@Test
	void TestStudentCourse() {
		student.setCourseId(1456);
		assertEquals(1456, student.getCourseId());
	}
	
	@Test
	void TestStudentPhoneNumber() {
		student.setMobileNo("9833766742");
		assertEquals("9833766742" , student.getMobileNo());
	}

}
