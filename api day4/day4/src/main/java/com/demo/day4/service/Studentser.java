package com.demo.day4.service;                                                    

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.day4.model.Student;
import com.demo.day4.repository.Studentrep;

@Service
public class Studentser {
	@Autowired
    Studentrep stu;
	public Student saveinfo(Student s) {
		return stu.save(s);
	}
	public List<Student> show(){
		return stu.findAll();
	}
}
