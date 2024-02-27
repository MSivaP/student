package com.example.student.DTO;

import org.springframework.stereotype.Service;

@Service
public class StudentsDTO {

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

}
