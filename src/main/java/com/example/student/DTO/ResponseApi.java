package com.example.student.DTO;

import org.springframework.stereotype.Service;

@Service
public class ResponseApi {
	
private	String message;
private String status;
public String getMessage() {
	return message;
}
public void setMessage(String message) {
	this.message = message;
}
public String getStatus() {
	return status;
}
public void setStatus(String status) {
	this.status = status;
}
@Override
public String toString() {
	return "ResponseApi [message=" + message + ", status=" + status + "]";
}


}
