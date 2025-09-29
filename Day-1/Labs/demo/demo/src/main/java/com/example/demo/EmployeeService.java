package com.example.demo;

import java.util.HashMap;
import java.util.*;

import org.springframework.stereotype.Service;

@Service
public class EmployeeService {

	private Map<Integer,Employee> employeeMap=new HashMap<>();
	public List<Employee> getAllEmployees(){
		return new ArrayList<>(employeeMap.values());
	}
	public Employee getEmployee(int id) {return employeeMap.get(id);}
	public void AddEmployee(Employee emp) {employeeMap.put(emp.getId(),emp);}
	public void UpdateEmployee(Employee emp) {employeeMap.put(emp.getId(),emp);}
	public void DeleteEmployee(int id) {employeeMap.remove(id);}
}
