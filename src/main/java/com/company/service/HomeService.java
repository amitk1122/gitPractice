package com.company.service;

import com.company.model.Employee;

public interface HomeService 
{

	public void saveData(Employee e);

	public Employee loginCheck(String un, String ps);

	public Iterable<Employee> displayAllData();

	public void deleteData(Employee e);

	public Employee editData(int id);

}
