package com.csi.service;

import java.util.List;

import com.csi.model.Employee;

public interface EmployeeService {
	
	public List<Employee> getAllData();
	public void saveData(Employee employee);
	public void updateData(int empId, Employee employee);
	public void deleteData(int empId);
}
