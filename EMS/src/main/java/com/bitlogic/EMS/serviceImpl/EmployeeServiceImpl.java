package com.bitlogic.EMS.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bitlogic.EMS.repository.EmployeeRepository;
import com.bitlogic.EMS.service.EmployeeService;

@Service
public class EmployeeServiceImpl implements EmployeeService{

	
	
	 @Autowired
	 EmployeeRepository er;
}
