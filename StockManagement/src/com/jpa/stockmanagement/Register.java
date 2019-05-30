package com.jpa.stockmanagement;

import java.sql.DriverManager;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Register extends HttpServlet {
	public void doGet(HttpServletRequest request, HttpServletResponse response) {
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
		Connection con = null;
		PreparedStatement ps = null;
		String name = request.getParameter("name");
		String empid = request.getParameter("empid");
		String age = request.getParameter("age");
		String email = request.getParameter("email");
		String address = request.getParameter("address");
		String password = request.getParameter("pwd");
		try {

			Class.forName("com.mysql.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/stock_mgmt", "root", "root");
			ps = con.prepareStatement(
					"insert into user(empid, name, age, email, address, password) values(?, ?, ?, ?, ?, ?)");
			ps.setString(1, empid);
			ps.setString(2, name);
			ps.setString(3, age);
			ps.setString(4, email);
			ps.setString(5, address);
			ps.setString(6, password);
			boolean flag = ps.execute();
			response.sendRedirect("jsp/Login.jsp");
		} catch (SQLException | ClassNotFoundException e) {
			System.out.println("I am from catch block");
			e.printStackTrace();
		} finally {
			System.out.println("Inside Finally");
			try {
				if (con != null) {
					con.close();
				}
				if (ps != null) {
					ps.close();
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}
}
