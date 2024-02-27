package com.example.student.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.example.student.DTO.ResponseApi;
import com.example.student.DTO.StudentsDTO;
import com.example.student.Service.StudentService;
import com.example.student.entity.Students;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/api/student")
@RequiredArgsConstructor
public class StudentsController {

	@Autowired
	private StudentService studentservice;

	@PostMapping("/create")
	@ResponseStatus(code = HttpStatus.CREATED)
	public ResponseApi save(@RequestBody StudentsDTO students) {
		return studentservice.saveStudent(students);
	}

	@GetMapping("/get")
	public ResponseEntity<List<Students>> fetchAll() {
		return ResponseEntity.ok(studentservice.findAllStudents());
	}

	@GetMapping("/{id}")
	@ResponseBody
	public Students findStudentById(@PathVariable Integer id) {
		
		return studentservice.findStudentById(id);

	}
	
	@PostMapping("/{id}")
	@ResponseBody
	public ResponseApi deletebyid(@PathVariable Integer id) {
		ResponseApi api =new ResponseApi();
		api.setMessage("data deleted su");
		api.setStatus("0");
		
		return studentservice.Deletebyid(id);
		
	}
	
	@GetMapping("/count")
	@ResponseBody
	public ResponseApi countMethod() {
		
		return studentservice.findcount();
		
	}

}
