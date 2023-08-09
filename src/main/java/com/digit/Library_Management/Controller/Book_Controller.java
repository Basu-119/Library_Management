package com.digit.Library_Management.Controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.digit.Library_Management.Model.Book;
import com.digit.Library_Management.Model.Bookreq;
import com.digit.Library_Management.Model.HibernateManager;

@WebServlet("/addBook")
public class Book_Controller extends HttpServlet {
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String book_id = req.getParameter("b_id");

		String bname = req.getParameter("b_name");
		String author = req.getParameter("author");
		Float cost = Float.parseFloat(req.getParameter("cost"));
		String category = req.getParameter("category");
		Bookreq b = new Bookreq();
		b.setBook_id(book_id);
		b.setBname(bname);
		b.setAuthor(author);
		b.setCost(cost);
		b.setCategory(category);
		b.setStatus("inactive");

		HibernateManager hbm= new HibernateManager();
		hbm.saveBookreq(b);
		resp.sendRedirect("/Library_Management/BookReqSucc.jsp");
	}


}
