package com.nissan.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.nissan.common.APIResponse;
import com.nissan.common.Validation;
import com.nissan.model.Customer;
import com.nissan.repo.ICustomerRepo;

@Service
public class CustomerServiceImple implements ICustomerService {
	
	@Autowired
	private ICustomerRepo customerRepo;

	@Autowired
	private APIResponse apiResponse;

	@Autowired
	private Validation validation;

	
	//get customer details
	public List<Customer> getCustomer() {
		// TODO Auto-generated method stub
		return (List<Customer>) customerRepo.findAll();
	}

	//add customer details
	public Customer saveCustomer(Customer customer) {
		if (validation.isNameValid(customer.getCustomerName())) {

			return customerRepo.save(customer);
		}
		return null;
	}


	//disable customer
	@Transactional
	public void disableCustomer(int id) {
		if(customerRepo.findById(id)==null) {
			throw new RuntimeException("Customer not found for id" + id);
		}
		else {
			customerRepo.disableCustomer(id);
		}

	}

	
}
