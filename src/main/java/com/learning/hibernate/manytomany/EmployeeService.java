package com.learning.hibernate.manytomany;

import java.util.List;
import java.util.Set;

import org.springframework.stereotype.Service;

import jakarta.transaction.Transactional;

@Service
public class EmployeeService {

	private final EmployeeRepo employeeRepository;

	private final ProjectRepo projectRepository;

	public EmployeeService(EmployeeRepo employeeRepository, ProjectRepo projectRepository) {
		this.employeeRepository = employeeRepository;
		this.projectRepository = projectRepository;
	}

	public Employee createEmployee(Employee employee) {
		return employeeRepository.save(employee);
	}

	public Employee getEmployeeById(Integer id) {
		return employeeRepository.findById(id)
				.orElseThrow(() -> new RuntimeException("Employee not found with id: " + id));
	}

	public List<Employee> getAllEmployees() {
		return employeeRepository.findAll();
	}

	public Employee updateEmployee(Integer id, Employee employeeDetails) {
		Employee employee = getEmployeeById(id);
		employee.setEmployeeName(employeeDetails.getEmployeeName());
		employee.setAssignedProjects(employeeDetails.getAssignedProjects());
		return employeeRepository.save(employee);
	}

	public void deleteEmployee(Integer id) {
		Employee employee = getEmployeeById(id);
		employeeRepository.delete(employee);
	}

	@Transactional
	public void assignProject(Integer empId, Integer prjId) {


		// fetch the employee first
		Employee employee = employeeRepository.findById(empId).get();

		// fetch the project
		Project project = projectRepository.findById(prjId).get();

		employee.getAssignedProjects().add(project);
//		project.getAssignedEmployees().add(employee);
		
		employeeRepository.save(employee);
	}
}
