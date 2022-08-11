package com.security.Validation.empEntity;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.Email;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.springframework.format.annotation.DateTimeFormat;

@Entity(name="Registration")
public class Empregister {
	@Id
	@GeneratedValue
	private Integer regid;
	
	
	private String name;
	
	private int age;

	private String gender;
	
	
	private String email;
	
	
	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	private String password;

	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private LocalDate joiningDate;

	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private LocalDate retiringDate;

	private String dept;
	public Empregister() {
		
	}

	public Empregister(int regid, String name, int age, String gender, LocalDate joiningDate, LocalDate retiringDate,
			String dept) {
		super();
		this.regid = regid;
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.joiningDate = joiningDate;
		this.retiringDate = retiringDate;
		this.dept = dept;
	}

	public Integer getRegId() {
		return regid;
	}

	public void setId(Integer regid) {
		this.regid = regid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public LocalDate getJoiningDate() {
		return joiningDate;
	}

	public void setJoiningDate(LocalDate joiningDate) {
		this.joiningDate = joiningDate;
	}

	public LocalDate getRetiringDate() {
		return retiringDate;
	}

	public void setRetiringDate(LocalDate retiringDate) {
		this.retiringDate = retiringDate;
	}

	public String getDept() {
		return dept;
	}

	public void setDept(String dept) {
		this.dept = dept;
	}


}
