/*package com.bankapp.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bankapp.dao.EmployeeDao;
import com.bankapp.entities.Account;
import com.bankapp.entities.Employee;

@Service
@Transactional
public class EmployeeServiceImpl implements EmployeeService {

	@Autowired
	private EmployeeDao employeeDao;
	
	@Override
	public List<Account> getAll() {
		return (List<Employee>) employeeDao.findAll();
	}

	@Override
	public Employee getEmployeeById(int id) {
		return empRepo.findById(id).orElseThrow(EmployeeNotFoundException:: new);
	}

	@Override
	public Employee save(Employee emp) {
		return empRepo.save(emp);
	}

	@Override
	public Employee delete(int empId) {
		Employee employeeToDelete=getEmployeeById(empId);
		empRepo.delete(employeeToDelete);
		return employeeToDelete;
	}

	@Override
	public Employee update(int empId, Employee emp) {
		Employee employeeToUpdate=getEmployeeById(empId);
		employeeToUpdate.setName(emp.getName());
		employeeToUpdate.setAge(emp.getAge());
		return empRepo.save(employeeToUpdate);
	}
}
*/