package com.jpa.stockmanagement;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class Search extends HttpServlet {

	public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
			Connection con = null;
			Statement stmt = null;
			try {
				Class.forName("com.mysql.jdbc.Driver");
				 con = DriverManager.getConnection("jdbc:mysql://localhost:3306/stock_mgmnt", "root", "root");
				 stmt = con.createStatement();
				  ResultSet rs = stmt.executeQuery("select * from user");
				 while(rs.next()) {
					
					 
				 }
			}catch(Exception e) {
				e.printStackTrace();
			}finally {
				con.close();
				stmt.close();
			}
		}
	
	
}
