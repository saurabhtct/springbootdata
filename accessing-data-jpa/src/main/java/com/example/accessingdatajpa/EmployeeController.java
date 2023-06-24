/**
 * 
 */
package com.example.accessingdatajpa;

import org.springframework.beans.factory.annotation.Autowired;
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

}
