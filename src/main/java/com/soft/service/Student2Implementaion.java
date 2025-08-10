package com.soft.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.soft.model.Student2;
import com.soft.repository.Student2Repository;

@Service
public class Student2Implementaion implements Student2Service{
 
	@Autowired
	private Student2Repository strepos;
	@Override
	public Student2 createStudent(Student2 student2) {
		// TODO Auto-generated method stub
		return strepos.save(student2);
	}

	@Override
	public List<Student2> getStudents() {
		// TODO Auto-generated method stub
		return strepos.findAll();
	}

//	@Override
//	public Student2 deleteStudent(Student2 student3) {
//		// TODO Auto-generated method stub
//		
//		return strepos.delete(student3);;
//	}

}
