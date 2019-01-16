package com.cg.ems.service;

import java.util.regex.Pattern;

import com.cg.ems.dao.EmployeeDAO;
import com.cg.ems.dao.EmployeeDaoImpl;
import com.cg.ems.exception.EMSException;

public class EmployeeServiceImpl implements EmployeeService {
	EmployeeDAO employeeDao = new EmployeeDaoImpl();

	@Override
	public boolean validateFields(String username, String password) throws EMSException {
		return employeeDao.validateFields(username, password);
	}

	@Override
	public boolean getvaldate(String firstname) {
		String val="[a-zA-Z]";
		boolean input=Pattern.matches(val, firstname);
		return input;
	}

}
