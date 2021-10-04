package com.koushik.MDM.dao;

import java.util.List;

import com.koushik.MDM.entity.Customer;

public interface CustomerDao {
	public List<Customer> getCustomers();
	public void saveCustomer(Customer customer);
	public Customer getCustomer(int theId);
	public List<Customer> getCustomerByName(String name);
	public void deleteCustomer(int theId);

}
