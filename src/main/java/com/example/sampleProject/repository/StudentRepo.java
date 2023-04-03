package com.example.sampleProject.repository;

import java.util.ArrayList;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.example.sampleProject.Entity.StudentEntity;

@Repository
public interface StudentRepo extends CrudRepository<StudentEntity, Integer> {
	
	@Query(value = "Select * from StudentEntity", nativeQuery = true)
	ArrayList<StudentEntity> findAllStudentDetails();

	@Query(value = "Select * from StudentEntity se where se.stu_id:stu_Id", nativeQuery = true)
	StudentEntity findStudentById(@Param("stu_Id") int stu_Id);


}
