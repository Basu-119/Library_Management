package com.digit.Library_Management.Model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.Statement;

public class Book {
	String book_id;
	String bname;
	String author;
	float cost;
	String category;
	String status;
	private PreparedStatement pstmt;
	private ResultSet res;

	public String getBook_id() {
		return book_id;
	}

	public void setBook_id(String book_id) {
		this.book_id = book_id;
	}

	public String getBname() {
		return bname;
	}

	public void setBname(String bname) {
		this.bname = bname;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public float getCost() {
		return cost;
	}

	public void setCost(float cost) {
		this.cost = cost;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public boolean appBook(String bname) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			String url = "jdbc:mysql://localhost:3306/library_management";
			String user = "root";
			String pwd = "root";
			Connection con = DriverManager.getConnection(url, user, pwd);
			ResultSetMetaData metadata;
			String sql = "select * from book_req where bname=?";
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, bname);

			res = pstmt.executeQuery();
			if(res.next()==true) {
			setBname(res.getString("bname"));
			setBook_id(res.getString("book_id"));
			setCategory(res.getString("author"));
			setCost(res.getFloat("cost"));
			setCategory(res.getString("category"));
			setStatus("active");
			return true;
			}
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		return false;
	}
}
