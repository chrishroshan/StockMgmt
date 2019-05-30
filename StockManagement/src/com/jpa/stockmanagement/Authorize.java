package com.jpa.stockmanagement;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class Authorize extends HttpServlet {

	public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
		serve(request, response);
	}
	public void serve(HttpServletRequest request, HttpServletResponse response) throws IOException {
		Connection con = null;
		PreparedStatement ps = null;
		String name = request.getParameter("uname");
		String pwd = request.getParameter("pwd");
		String userId = null;
		HttpSession session = null;

		try {
			Class.forName("com.mysql.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/stock_mgmt", "root", "root");
			ps = con.prepareStatement("select empid from user where name=? and password=?");
			ps.setString(1, name);
			ps.setString(2, pwd);
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				userId = rs.getString("empid");
				session = request.getSession();
				session.setAttribute("userId", userId);
			}
			if (userId != null) {
				request.getRequestDispatcher("jsp/Frame_nav.jsp").forward(request, response);
			} else {
				request.getRequestDispatcher("jsp/Login.jsp").forward(request, response);
			}
		} catch (SQLException | ClassNotFoundException | ServletException e) {
			e.printStackTrace();
		} finally {
			System.out.println("LOADED");
			try {
				con.close();
				ps.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}
}