package com.jpa.stockmanagement;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.jpa.stockmanagement.vo.StockVo;

public class DeleteAction extends HttpServlet {

	public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
		
		
		int productId = Integer.parseInt(request.getParameter("ProductId"));
System.out.println(productId);
		PreparedStatement stmt = null;
		Connection conn = null;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/stock_mgmt", "root", "root");

			String sql;
			stmt = conn.prepareStatement("DELETE FROM stocks WHERE productid=?");
			stmt.setInt(1, productId);
			stmt.executeUpdate();
			
			request.getRequestDispatcher("jsp/Frame_nav.jsp").forward(request, response);
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}
