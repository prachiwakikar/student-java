package com.soft.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.soft.model.Student2;
import com.soft.service.Student2Service;

@RestController
@RequestMapping("/api2")
public class Student2Controller {
	
	@Autowired
	private Student2Service studentservice;
	
	@PostMapping("/cstudent")
	public Student2 createSt(@RequestBody Student2 st) {
		return studentservice.createStudent(st);
		
	}
   
   @GetMapping("/gstudent")
   List<Student2> getallStudent(){
	return studentservice.getStudents();
	   
   }

}
