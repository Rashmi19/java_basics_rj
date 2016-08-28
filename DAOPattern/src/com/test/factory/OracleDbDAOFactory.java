package com.test.factory;
import java.sql.*;

import com.test.dao.CustomerDAO;
import com.test.dao.OracleDbCustomerDAO;

public class OracleDbDAOFactory extends DAOFactory {

	 
	  public static final String DRIVER = "oracle.jdbc.OracleDriver";
	  public static final String DBURL = "jdbc:oracle:thin:@[host]:[port]:[sid]";
	 
	  // method to create Cloudscape connections
	  public static Connection createConnection() {
	    // Use DRIVER and DBURL to create a connection
	    // Recommend connection pool implementation/usage
		  return null;
	  }
	  public CustomerDAO getCustomerDAO() {
	    // OracleDbCustomerDAO implements CustomerDAO
		return new OracleDbCustomerDAO();
	  }

}
