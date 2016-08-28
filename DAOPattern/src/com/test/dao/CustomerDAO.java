package com.test.dao;

public interface CustomerDAO {

	public int insertCustomer(Customer cust);

	public boolean deleteCustomer(int custId);

	public Customer findCustomer(int custId);

	public boolean updateCustomer(Customer cust);

}
