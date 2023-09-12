package com.bitlogic.EMS.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.bitlogic.EMS.model.Employee;
import com.bitlogic.EMS.service.EmployeeService;

@RestController
public class EmployeeController {

	@Autowired
	EmployeeService es;

	@GetMapping("/msg")
	public String m1()
	{
		return "Success";
	}

	@PostMapping("/save")
	public ResponseEntity<Employee> saveData(@RequestBody Employee e)
	{
		Employee e1=es.saveData(e);
		return new ResponseEntity<Employee>(e1, HttpStatus.OK);
	}
	
	@GetMapping("/get")
	public ResponseEntity<List<Employee>> getAllData()
	{
	List<Employee> empl=	es.getAllData();
		
		return new ResponseEntity<List<Employee>>(empl, HttpStatus.OK);
	}
	
}
