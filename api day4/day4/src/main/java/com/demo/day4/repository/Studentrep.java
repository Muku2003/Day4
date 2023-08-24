package com.demo.day4.repository;                                                                   

import org.springframework.data.jpa.repository.JpaRepository;

import com.demo.day4.model.Student;

public interface Studentrep extends JpaRepository<Student,Integer>{

}
