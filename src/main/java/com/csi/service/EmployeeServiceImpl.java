package com.csi.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.csi.dao.EmployeeDao;
import com.csi.model.Employee;

@Service
public class EmployeeServiceImpl implements EmployeeService {

	@Autowired
	EmployeeDao employeeDaoImpl;

	@Override
	public List<Employee> getAllData() {
		// TODO Auto-generated method stub
		return employeeDaoImpl.getAllData();
	}

	@Override
	public void saveData(Employee employee) {
		// TODO Auto-generated method stub
		employeeDaoImpl.saveData(employee);
	}

	@Override
	public void updateData(int empId, Employee employee) {
		// TODO Auto-generated method stub
		employeeDaoImpl.updateData(empId, employee);
	}

	@Override
	public void deleteData(int empId) {
		// TODO Auto-generated method stub
		employeeDaoImpl.deleteData(empId);
	}

}
