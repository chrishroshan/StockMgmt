package com.jpa.stockmanagement;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;


import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.jpa.stockmanagement.vo.StockVo;

public class UpdateAction extends HttpServlet {

	public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
		
		
		String ProductId = request.getParameter("ProductId");
		String ProductName = request.getParameter("ProductName");
		String Price = request.getParameter("Price");
		String Quantity = request.getParameter("Quantity");
		String Weight = request.getParameter("Weight");
		PreparedStatement ps = null;
		Connection conn = null;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/stock_mgmt", "root", "root");

			String sql;
			sql = "UPDATE stocks SET ProductName=?,Price_piece=?,Quantity=?, Weight=? WHERE productid=?";

			ps = conn.prepareStatement(sql);
			ps.setString(1,ProductName);
			ps.setString(2,Price);
			ps.setString(3,Quantity);
			ps.setString(4,Weight);
			ps.setString(5,ProductId);		
			ps.executeUpdate();
						
			
			request.getRequestDispatcher("jsp/Frame_nav.jsp").forward(request, response);
		} 
		
		catch (Exception e) {
			e.printStackTrace();
		}

	}
}