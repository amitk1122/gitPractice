package com.company.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.company.model.Employee;

@Repository
public interface HomeRepository extends CrudRepository<Employee, Integer>
{
	public Employee findAllByUnameAndPassword(String uname,String password);
	
	public Employee findAllById(int id);

}
