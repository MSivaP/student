package com.example.student.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;


@Entity
@Table(name = "Students")
public class Students {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
	private String studentname;
	private String schoolname;
	private Long studentrollno;
	private String emailid;
	private Integer schoolid;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getStudentname() {
		return studentname;
	}

	public void setStudentname(String studentname) {
		this.studentname = studentname;
	}

	public String getSchoolname() {
		return schoolname;
	}

	public void setSchoolname(String schoolname) {
		this.schoolname = schoolname;
	}

	public Long getStudentrollno() {
		return studentrollno;
	}

	public void setStudentrollno(Long studentrollno) {
		this.studentrollno = studentrollno;
	}

	public String getEmailid() {
		return emailid;
	}

	public void setEmailid(String emailid) {
		this.emailid = emailid;
	}

	public Integer getSchoolid() {
		return schoolid;
	}

	public void setSchoolid(Integer schoolid) {
		this.schoolid = schoolid;
	}

	@Override
	public String toString() {
		return "Students [id=" + id + ", studentname=" + studentname + ", schoolname=" + schoolname + ", studentrollno="
				+ studentrollno + ", emailid=" + emailid + ", schoolid=" + schoolid + "]";
	}

}
