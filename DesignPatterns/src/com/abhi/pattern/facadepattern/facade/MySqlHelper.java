package com.abhi.pattern.facadepattern.facade;

import java.sql.Connection;

public class MySqlHelper {
	
	public static Connection getMySqlDBConnection() {
		//get mysql connection using connection parameters
		return null;
	}
	
	public void generateMySqlPDFReport(String tableName, Connection con) {
		//get data from table and generate pdf report
	}
	
	public void generateMySqlHTMLReport(String tableName, Connection co) {
		//get data from table and generate html report
	}
	
}
