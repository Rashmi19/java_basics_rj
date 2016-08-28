package com.test.factory;

import com.test.dao.CustomerDAO;

public abstract class DAOFactory {

	// List of DAO types supported by the factory
	public static final int ORACLE = 1;
	public static final int XML = 2;
	public static final int SYBASE = 3;
	public static final int DAOORACLEDB = 0;
	public static final int MYSQL = 5;


	// There will be a method for each DAO that can be
	// created. The concrete factories will have to
	// implement these methods.
	public abstract CustomerDAO getCustomerDAO();

	public static DAOFactory getDAOFactory(int whichFactory) {

		switch (whichFactory) {
		case MYSQL:
			return new MySQLDbDAOFactory();
		default:
			return null;
		}
	}
}
