package com.abhi.pattern.facadepattern.facade;

import java.sql.Connection;

public class HelperFacade {
	
	public static void generateReport(DBTypes dbTypes, ReportTypes reportTypes, String tableName) {
		
		Connection con = null;
		
		switch (dbTypes) {
		case MYSQL:
			con = MySqlHelper.getMySqlDBConnection();
			MySqlHelper mySqlHelper = new MySqlHelper();
			switch (reportTypes) {
			case HTML:
				mySqlHelper.generateMySqlHTMLReport(tableName, con);
				break;
			case PDF:
				mySqlHelper.generateMySqlPDFReport(tableName, con);
				break;
			}
			
		case ORACLE:
			con = OracleHelper.getOracleDBConnection();
			OracleHelper oracleHelper = new OracleHelper();
			switch (reportTypes) {
			case HTML:
				oracleHelper.generateOracleHTMLReport(tableName, con);
				break;
			case PDF:
				oracleHelper.generateOraclePDFReport(tableName, con);
				break;
			}
		}
		
	}
	
}

enum DBTypes{
	MYSQL, ORACLE;
}

enum ReportTypes{
	HTML, PDF;
}