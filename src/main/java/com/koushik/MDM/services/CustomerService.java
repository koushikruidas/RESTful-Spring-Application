package com.koushik.MDM.services;

import java.util.List;

import com.koushik.MDM.entity.Customer;

public interface CustomerService {

	public List<Customer> getCustomers();
	public void saveCustomer(Customer customer);
	public Customer getCustomer(int theId);
	public List<Customer> getCustomerByName(String name);
	public void deleteCustomer(int theId);
}
