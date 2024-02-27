package com.example.student.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.student.DTO.ResponseApi;

import com.example.student.DTO.StudentsDTO;
import com.example.student.entity.Students;
import com.example.student.repo.StudentRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class StudentService {

	@Autowired
	private ResponseApi responseApi;

	@Autowired
	private StudentRepository studentrepo;

	public ResponseApi saveStudent(StudentsDTO dto) {
		Students students = new Students();
		try {
			students.setEmailid(dto.getEmailid());
			students.setId(dto.getId());
			students.setSchoolid(dto.getSchoolid());
			students.setStudentname(dto.getStudentname());
			students.setStudentrollno(dto.getStudentrollno());
			students.setSchoolname(dto.getSchoolname());

			studentrepo.save(students);
			responseApi.setMessage("Data inserted successful");
			responseApi.setStatus("0");
		} catch (Exception e) {
			// TODO: handle exception
			responseApi.setMessage("Data not inserted successful");
			responseApi.setStatus("1");
			e.printStackTrace();
		}
		return responseApi;

	}

	public List<Students> findAllStudents() {

		return studentrepo.findAll();

	}

	public Students findStudentById(Integer id) {
		try {
			System.out.println("-----Data fetched successfully");
		} catch (Exception e) {
			// TODO: handle exception
		}
		return studentrepo.findById(id).orElse(null);
	}

	public ResponseApi Deletebyid(Integer id) {
		// TODO Auto-generated method stub

		studentrepo.deleteById(id);
		// studentrepo.deleteById(id);
		return responseApi;

	}

	public ResponseApi findcount() {

		Long count = studentrepo.count();
		// TODO Auto-generated method stub
		System.out.println(count);
		responseApi.setMessage("count"+count);
		responseApi.setStatus("00");
		return responseApi;
	}

}