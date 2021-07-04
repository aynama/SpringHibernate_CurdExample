package org.aynama.dao;

import java.util.List;

import org.aynama.model.Employee;

public interface EmployeeDao {

	void saveEmployee(Employee emp);
	List<Employee> getEmployees();
}
