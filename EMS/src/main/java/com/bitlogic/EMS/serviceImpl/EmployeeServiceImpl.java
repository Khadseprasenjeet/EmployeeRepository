package com.bitlogic.EMS.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bitlogic.EMS.model.Employee;
import com.bitlogic.EMS.repository.EmployeeRepository;
import com.bitlogic.EMS.service.EmployeeService;

@Service
public class EmployeeServiceImpl implements EmployeeService{

	
	
	 @Autowired
	 EmployeeRepository er;

	@Override
	public Employee saveData(Employee e)
	{
		return er.save(e);
	}

	@Override
	public List<Employee> getAllData() {
		
		
		return er.findAll();
	}
}
