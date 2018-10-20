package com.springdemo.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springdemo.entity.Customer;
import com.springdemo.service.CustomerService;

@RestController
@RequestMapping("/api")
public class CustomerRestController {
//autowire customer service
@Autowired
private CustomerService customerService;

//add mapping for GET/customers
@GetMapping("/customers")
public List<Customer> getCustomers()
{
	return customerService.getCustomers();
}

//add mapping for GET/customers/{customerID}
@GetMapping("/customers/{customerId}")
public Customer getCustomer(@PathVariable int customerId)
{
	Customer theCustomer=customerService.getCustomer(customerId);
	if(theCustomer==null)
	{
		throw new CustomerNotFoundException();
	}
	return theCustomer;
}

//add mapping for Post/Customers
@PostMapping("/customers")
public Customer addCustomer(@RequestBody Customer theCustomer)
{   theCustomer.setId(0);
	customerService.saveCustomer(theCustomer);
	return theCustomer;
	
}
//add mapping for Delete/Customers
@DeleteMapping("/customers/{customerId}")
public int deleteCustomer(@PathVariable int customerId)
{
	int theCustomer=customerService.deleteCustomer(customerId);
	return theCustomer;
	
}
}
