package com.example.sampleProject.Entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import java.sql.Timestamp;

@Entity
@Table(name="student")
public class StudentEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "stu_id")
	private Integer stu_id;

	@Column(name = "stu_name")
	private String stu_name;

	@Column(name = "dept_id")
	private Integer dept_id;

	@Column(name = "semester")
	private Integer dept_Code;

	@Column(name = "gender")
	private String gender;

	@Column(name = "subject_code")
	private Integer subject_code;

	@Column(name = "DOB")
	private Timestamp dOB;

	@Column(name = "address")
	private String address;

	/**
	 * Default Constructor
	 */
	public StudentEntity() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * Parameterized constructor
	 * 
	 * @param stu_id
	 * @param stu_name
	 * @param dept_id
	 * @param dept_Code
	 * @param gender
	 * @param subject_code
	 * @param dOB
	 * @param address
	 */
	public StudentEntity(Integer stu_id, String stu_name, Integer dept_id, Integer dept_Code, String gender,
			Integer subject_code, Timestamp dOB, String address) {
		super();
		this.stu_id = stu_id;
		this.stu_name = stu_name;
		this.dept_id = dept_id;
		this.dept_Code = dept_Code;
		this.gender = gender;
		this.subject_code = subject_code;
		this.dOB = dOB;
		this.address = address;
	}

	public Integer getStu_id() {
		return stu_id;
	}

	public void setStu_id(Integer stu_id) {
		this.stu_id = stu_id;
	}

	public String getStu_name() {
		return stu_name;
	}

	public void setStu_name(String stu_name) {
		this.stu_name = stu_name;
	}

	public Integer getDept_id() {
		return dept_id;
	}

	public void setDept_id(Integer dept_id) {
		this.dept_id = dept_id;
	}

	public Integer getDept_Code() {
		return dept_Code;
	}

	public void setDept_Code(Integer dept_Code) {
		this.dept_Code = dept_Code;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public Integer getSubject_code() {
		return subject_code;
	}

	public void setSubject_code(Integer subject_code) {
		this.subject_code = subject_code;
	}

	public Timestamp getdOB() {
		return dOB;
	}

	public void setdOB(Timestamp dOB) {
		this.dOB = dOB;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "StudentEntity [stu_id=" + stu_id + ", stu_name=" + stu_name + ", dept_id=" + dept_id + ", dept_Code="
				+ dept_Code + ", gender=" + gender + ", subject_code=" + subject_code + ", dOB=" + dOB + ", address="
				+ address + "]";
	}
}
