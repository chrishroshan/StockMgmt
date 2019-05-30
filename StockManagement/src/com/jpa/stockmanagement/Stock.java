package com.jpa.stockmanagement;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Calendar;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Stock extends HttpServlet {
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
		Connection con = null;
		PreparedStatement ps = null;
		String ProductId = request.getParameter("ProductId");
		String ProductName = request.getParameter("ProductName");
		String Price = request.getParameter("Price");
		String Quantity = request.getParameter("Quantity");
		String Weight = request.getParameter("Weight");
		String userId = null;
		
		try {
			if (request.getSession().getAttribute("userId") != null) {
				userId = request.getSession().getAttribute("userId").toString();
				SimpleDateFormat sdf = new SimpleDateFormat("yyyy-mm-dd-hh-mm-ss");
				
				java.sql.Date currDate = new Date(Calendar.getInstance().getTime().getTime());

				Class.forName("com.mysql.jdbc.Driver");
				con = DriverManager.getConnection("jdbc:mysql://localhost:3306/stock_mgmt", "root", "root");
				ps = con.prepareStatement(
						"insert into stocks(productid, productname, price_piece, quantity, weight, create_time) values(?, ?, ?, ?, ?, ?)");
				ps.setString(1, ProductId);
				ps.setString(2, ProductName);
				ps.setString(3, Price);
				ps.setString(4, Quantity);
				ps.setString(5, Weight);
				ps.setDate(6, currDate);

				boolean flag = ps.execute();
				response.sendRedirect("jsp/Frame_nav.jsp");
			}
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
