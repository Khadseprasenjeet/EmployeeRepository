package com.bitlogic.EMS.service;

import java.util.List;

import com.bitlogic.EMS.model.Employee;

public interface EmployeeService {

	public Employee saveData(Employee e);

	public List<Employee> getAllData();

}
