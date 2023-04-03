/**
 * 
 */
package com.example.sampleProject.controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.sampleProject.Entity.StudentEntity;
import com.example.sampleProject.service.StudentService;

/**
 * @author PE579QF
 *
 */
@RestController
@RequestMapping("/api")
public class StudentController {

	@Autowired
	private StudentService studentService;

	/**
	 * Method to fetch details of all Students
	 * 
	 * @return list of Student details
	 */
	@GetMapping("/")
	public ArrayList<StudentEntity> getAllStudent() {

		ArrayList<StudentEntity> arrayList = new ArrayList<>();
		arrayList = (ArrayList<StudentEntity>) studentService.findAllStudentDetails();
		return arrayList;
	}

	/**
	 * Method to fetch details of specified student by using Student Id
	 * 
	 * @param studentId
	 * @return Student detail
	 */
	@GetMapping("/student/{id}")
	public StudentEntity getStudentById(@PathVariable(value = "id") Integer studentId) {
		StudentEntity student = null;
		student = studentService.findStudentById(studentId);

		return student;
	}

	/**
	 * Add Student details
	 * 
	 * @param student
	 * @return
	 */
	@PostMapping("/save")
	public String addStudentDetails(@RequestBody StudentEntity student) {
		String demo = "";
		String success = "Success";
		String failure = "Failure";
		studentService.addStudentDetails(student);

		if (demo == "Student Details added") {
			return success;
		}
		return failure;
	}
}
