package com.csi.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.csi.model.Employee;
import com.csi.service.EmployeeService;

@RestController
@RequestMapping("/api")
public class EmployeeController {
	
	@Autowired
	EmployeeService employeeServiceImpl;
	
	
	@GetMapping("/getdata")
	public List<Employee> getData()
	{
		return employeeServiceImpl.getAllData();
	}
	
	@PostMapping("/savedata")
	public String saveData(@RequestBody Employee employee)
	{
		employeeServiceImpl.saveData(employee);
		return "save Data Successfully";
	}
	
	@PutMapping("/updatedata/{empId}")
	public String updateData(@PathVariable int empId, @RequestBody Employee employee)
	{
		 employeeServiceImpl.updateData(empId, employee);
		 return "data Update Successfully";
	}
	
	
	@DeleteMapping("/deletedata/{empId}")
	public String deleteData(@PathVariable int empId)
	{
		employeeServiceImpl.deleteData(empId);
		return "Data Delete Successfully";
	}
	

}