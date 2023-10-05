package com.nissan.controller;

import java.nio.file.AccessDeniedException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nissan.common.APIResponse;

import com.nissan.model.Customer;
import com.nissan.service.ICustomerService;

@CrossOrigin
@RestController // Controller+@Configuration
@RequestMapping("/api")
public class CustomerController {
	
	@Autowired
	private APIResponse apiResponse;
	
	@Autowired
	private ICustomerService customerService;
	
	
	
	//getting all the customer details
	@GetMapping("/customers")
	public List<Customer> getCustomer() {
		
		return customerService.getCustomer();
	}
	
	
	//adding a customer detail
	@PostMapping("/customers")
	public ResponseEntity<APIResponse> addEmployee(@RequestBody Customer customer){
		
		if (customerService.saveCustomer(customer) == null) {
			apiResponse.setData("Name can have only alphabets!");
			apiResponse.setStatus(500);
			apiResponse.setError("INVALID NAME");

			return ResponseEntity.status(apiResponse.getStatus()).body(apiResponse);
		}
		apiResponse.setData("Customer added successfully");
		apiResponse.setStatus(200);
		return ResponseEntity.status(apiResponse.getStatus()).body(apiResponse);

	}
	
	@PutMapping("/customers")
	public ResponseEntity<APIResponse> updateCustomer(@RequestBody Customer customer){
		if (customerService.saveCustomer(customer) == null) {
			apiResponse.setData("Name can have only alphabets!");
			apiResponse.setStatus(500);
			apiResponse.setError("INVALID NAME");

			return ResponseEntity.status(apiResponse.getStatus()).body(apiResponse);
		}
		apiResponse.setData("Customer edited successfully");
		apiResponse.setStatus(200);
		return ResponseEntity.status(apiResponse.getStatus()).body(apiResponse);

	}
	
	// disable Customer
				@DeleteMapping("/customers/disable/{id}")
				public void disableEmployee(@PathVariable int id)
				{
					
					customerService.disableCustomer(id);
				}
	
	

}
