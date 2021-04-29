package com.testwebflux.api.employeemanagement;

import java.util.UUID;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/employees")
public class EmployeeController {
	private final EmployeeRepository employeeRepository;
	
	//constructor with repository injection
	EmployeeController(EmployeeRepository repository) {
	    this.employeeRepository = repository;
	 }
	
	//endpoints
	@GetMapping("/{id}")
	private Mono<Employee> getEmployeeById(@PathVariable UUID id) {
		return employeeRepository.findById(id);
	}
	
	@GetMapping
	private Flux<Employee> getAllEmployees() {
		return employeeRepository.findAll();
	}
	
	
}
