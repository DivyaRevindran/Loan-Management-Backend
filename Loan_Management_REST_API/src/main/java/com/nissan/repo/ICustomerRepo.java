package com.nissan.repo;

import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.nissan.model.Customer;

public interface ICustomerRepo extends CrudRepository<Customer, Integer>{
	
	
	@Modifying
	@Query("UPDATE com.nissan.model.Customer SET isActive=0 WHERE id = ?1")
	public void disableCustomer(Integer id);
}
