package com.amigoscode.amigoscodesbtfc2n20210110.student;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.amigoscode.amigoscodesbtfc2n20210110.student.Student;

@Service
public class StudentService {

	private final StudentRepository studentRepository;

	@Autowired
	public StudentService(StudentRepository studentRepository){
		this.studentRepository = studentRepository;
	}

    public List<Student> getStudents(){
		return studentRepository.findAll();
	}

	public void addNewStudent(Student student){
		System.out.println(student);
	}
}
