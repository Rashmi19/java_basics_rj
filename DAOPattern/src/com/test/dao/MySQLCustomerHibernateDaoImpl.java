package com.test.dao;

public class MySQLCustomerHibernateDaoImpl implements CustomerDAO {

	@Override
	public int insertCustomer(Customer cust) {
		// HIBERNATE API
		
		return 0;
	}

	@Override
	public boolean deleteCustomer(int custId) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Customer findCustomer(int custId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean updateCustomer(Customer cust) {
		// TODO Auto-generated method stub
		return false;
	}

}
