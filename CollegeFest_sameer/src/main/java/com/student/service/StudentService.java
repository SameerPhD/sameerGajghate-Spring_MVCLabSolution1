package com.student.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.student.model.Student;

@Service
public interface StudentService {
	List<Student>getAllStudents();
	public void saveStudent(Student student);
	Student getStudentById(long studentid);
	public void deleteStudentById(long studentid);
	}
