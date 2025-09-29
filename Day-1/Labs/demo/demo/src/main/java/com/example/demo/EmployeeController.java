package com.example.demo;

import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/employees")
public class EmployeeController {
	@Autowired
	private EmployeeService service;
	
	@GetMapping()
	public List<Employee> getAll(){return service.getAllEmployees();}
	
	@GetMapping("/{id}")
	public Employee get(@PathVariable int id) {
		return service.getEmployee(id);
	}
	@PostMapping
	public void add(@RequestBody Employee emp) {
		 service.AddEmployee(emp);
	}
	@PutMapping("/{id}")
	public void update(@RequestBody Employee emp) {
		 service.UpdateEmployee(emp);
	}
	@DeleteMapping("/{id}")
	public void delete(@PathVariable int id) {
		 service.DeleteEmployee(id);
	}

}
