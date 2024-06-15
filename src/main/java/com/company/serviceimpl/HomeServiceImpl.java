package com.company.serviceimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.company.model.Employee;
import com.company.repository.HomeRepository;
import com.company.service.HomeService;

@Service
public class HomeServiceImpl implements HomeService
{
	@Autowired
	HomeRepository hr;

	@Override
	public void saveData(Employee e)
	{
		hr.save(e);
	}

	@Override
	public Employee loginCheck(String un, String ps)
	{
		
		return hr.findAllByUnameAndPassword(un, ps);
	}

	@Override
	public Iterable<Employee> displayAllData()
	{
		
		return hr.findAll();
	}

	@Override
	public void deleteData(Employee e) 
	{
		hr.delete(e);
		
	}

	@Override
	public Employee editData(int id)
	{
		
		return hr.findAllById(id);
	}

}
