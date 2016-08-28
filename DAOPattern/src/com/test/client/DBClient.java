package com.test.client;

import com.test.dao.Customer;
import com.test.dao.CustomerDAO;
import com.test.factory.DAOFactory;

public class DBClient {

	// create the required DAO Factory
//	DAOFactory oracleDbFactory = DAOFactory.getDAOFactory(DAOFactory.DAOORACLEDB);
	DAOFactory mySQLDbFactory = DAOFactory.getDAOFactory(DAOFactory.MYSQL);

	// Create a DAO
	CustomerDAO custDAO = mySQLDbFactory.getCustomerDAO();
	private int custId = 1;

	public void doCustOperations() {
		Customer customer = new Customer();

		// create a new customer
		int newCustNo = custDAO.insertCustomer(customer);

		// Find a customer object. Get the Transfer Object.
		Customer cust = custDAO.findCustomer(custId);

		// update the customer object using the DAO
		boolean result = custDAO.updateCustomer(customer);
	}
}
