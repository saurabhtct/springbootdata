package com.example.accessingdatajpa;

import java.util.ArrayList;

public interface CustomerService {
	ArrayList<Customer> findAllCustomer();

	Customer findAllCustomerByID(long id);

	void addCustomer();

	void deleteAllData();
}
