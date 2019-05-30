package com.jpa.stockmanagement;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.jpa.stockmanagement.vo.StockVo;

public class View extends HttpServlet {

	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {

		Statement stmt = null;
		Connection conn = null;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/stock_mgmt", "root", "root");

			String sql;
			stmt = conn.createStatement();
			sql = "SELECT * FROM stocks";
			ResultSet rs = stmt.executeQuery(sql);
			List stockList = new ArrayList<>();
			StockVo stock = null;
			while (rs.next()) {
				stock = new StockVo();
				stock.setProductid(rs.getInt("productid"));
				stock.setProductname(rs.getString("productname"));
				stock.setPrice_piece(rs.getInt("price_piece"));
				stock.setQuantity(rs.getInt("quantity"));
				stock.setWeight(rs.getInt("weight"));
				stock.setCreate_time(rs.getString("create_time"));
				stockList.add(stock);
			}
			request.setAttribute("stockDet", stockList);

			request.getRequestDispatcher("jsp/F_view.jsp").forward(request, response);
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}