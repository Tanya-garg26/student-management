/**
 * 
 */
package com.example.sampleProject.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.sampleProject.Entity.StudentEntity;
import com.example.sampleProject.repository.StudentRepo;

/**
 * @author PE579QF
 *
 */
@Service
public class StudentService {

	@Autowired
	private StudentRepo repo;

	public ArrayList<StudentEntity> findAllStudentDetails() {
		ArrayList<StudentEntity> studentDetails = new ArrayList<>();
		studentDetails = (ArrayList<StudentEntity>) repo.findAllStudentDetails();
		return studentDetails;
	}

	public String addStudentDetails(StudentEntity student) {
		String student_added = "Student details added!";
		repo.save(student);
		return student_added;
	}

	public StudentEntity findStudentById(int id) {
		return repo.findStudentById(id);
	}

}
