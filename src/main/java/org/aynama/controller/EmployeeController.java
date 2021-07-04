package org.aynama.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.aynama.dao.EmployeeDao;
import org.aynama.model.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class EmployeeController {

	@Autowired
	private EmployeeDao employeeDao;
	
	@RequestMapping(value="process_signup", method=RequestMethod.POST)
	public ModelAndView saveEmployee(HttpServletRequest request, ModelMap map){
		
		
		Employee emp = new Employee();
		emp.setEmpId(Long.valueOf(request.getParameter("empId")));
		emp.setEmpName(request.getParameter("empName"));
		emp.setDesignation(request.getParameter("designation"));
		emp.setSalary(request.getParameter("empSalary"));
		
		employeeDao.saveEmployee(emp);
		
		List<Employee> listEmployees = employeeDao.getEmployees();
		map.addAttribute("employees",listEmployees);
		
		System.out.println(" #### List size :"+listEmployees.size());
		
		return new ModelAndView("list","message","Employee saved.");
		
	}
}
