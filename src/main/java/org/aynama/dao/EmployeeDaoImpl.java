package org.aynama.dao;

import java.util.List;

import org.aynama.model.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate3.HibernateTemplate;
import org.springframework.stereotype.Repository;

@Repository("employeeDao")
public class EmployeeDaoImpl implements EmployeeDao{

	@Autowired
	private HibernateTemplate ht;
	
	public void saveEmployee(Employee emp) {
		
		ht.save(emp);
	}

	public List<Employee> getEmployees() {
		
		List<Employee> list = ht.loadAll(Employee.class);
		return list;
	}

}
