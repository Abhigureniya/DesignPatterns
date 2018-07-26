package com.abhi.pattern.facadepattern.facade;

import java.sql.Connection;

public class OracleHelper {
	
	public static Connection getOracleDBConnection() {
		//get mysql connection using connection parameters
		return null;
	}
	
	public void generateOraclePDFReport(String tableName, Connection con) {
		//get data from table and generate pdf report
	}
	
	public void generateOracleHTMLReport(String tableName, Connection co) {
		//get data from table and generate html report
	}
	
}
