package com.nissan.service;

import java.util.List;

import com.nissan.common.APIResponse;

import com.nissan.model.Customer;

public interface ICustomerService {
			
			//list
			public List<Customer> getCustomer();
			
			//insert
			public Customer saveCustomer(Customer customer);
			
			
			//disable
			public void disableCustomer(int id);
}
