/**
 * 
 */
package com.example.accessingdatajpa;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author Administrator
 *
 */
@Service
public class CustomerServiceImpl implements CustomerService {

	@Autowired
	CustomerRepository customerRepository;

	@Override
	public ArrayList<Customer> findAllCustomer() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Customer findAllCustomerByID(long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void addCustomer() {
		ArrayList<Customer> emp = new ArrayList<Customer>();
        emp.add(new Customer("Lucknow", "Shubham"));
        emp.add(new Customer("Delhi", "Puneet"));
        emp.add(new Customer("Pune", "Abhay"));
        emp.add(new Customer("Noida", "Anurag"));
        for (Customer employee : emp) {
        	customerRepository.save(employee);
        }

	}

	@Override
	public void deleteAllData() {
		// TODO Auto-generated method stub

	}

}
