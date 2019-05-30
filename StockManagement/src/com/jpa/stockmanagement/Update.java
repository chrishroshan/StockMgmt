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

public class Update extends HttpServlet {

	public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
		
		
		int productId = Integer.parseInt(request.getParameter("ProductId"));
System.out.println(productId);
		PreparedStatement stmt = null;
		Connection conn = null;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/stock_mgmt", "root", "root");

			stmt = conn.prepareStatement("select * from stocks where productid=?");
			stmt.setInt(1, productId);
			ResultSet rs = stmt.executeQuery();
			StockVo vo = new StockVo();
			while(rs.next()) {
				vo.setProductid(rs.getInt(1));
				vo.setProductname(rs.getString(2));
				vo.setPrice_piece(rs.getInt(3));
				vo.setQuantity(rs.getInt(4));
				vo.setWeight(rs.getInt(5));
			}
			request.setAttribute("StockInfo", vo);

			request.getRequestDispatcher("jsp/F_UpdateAction.jsp").forward(request, response);
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}
