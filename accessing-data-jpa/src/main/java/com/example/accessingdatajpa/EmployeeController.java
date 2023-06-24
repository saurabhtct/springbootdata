/**
 * 
 */
package com.example.accessingdatajpa;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Administrator
 *
 */
@RestController
public class EmployeeController {

	@Autowired
	CustomerService customerService;

	@PostMapping("/")
	public void add() {
		customerService.addCustomer();
	}

	@GetMapping("/findAll")
	public ArrayList<Customer> getAllCustomer() {
		return customerService.findAllCustomer();
	}

	@GetMapping("/findbyid/{id}")
	public Customer getCustomerByUsingId(@PathVariable long id) {
		return customerService.findAllCustomerByID(id);
	}

	@DeleteMapping("/delete")
	public void delete() {
		customerService.deleteAllData();
	}

}
