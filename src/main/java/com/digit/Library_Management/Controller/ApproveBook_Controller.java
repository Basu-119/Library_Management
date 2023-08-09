package com.digit.Library_Management.Controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.digit.Library_Management.Model.Book;
import com.digit.Library_Management.Model.Bookreq;
import com.digit.Library_Management.Model.HibernateManager;

@WebServlet("/appbook2")
public class ApproveBook_Controller extends HttpServlet{
@Override
protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		

	String book_id = req.getParameter("book_id");

	HibernateManager n1=new HibernateManager();
	HttpSession session = req.getSession();
	Bookreq usr= n1.getSpx(book_id);
	
	Book b2=new Book();
	b2.setBook_id(usr.getBook_id());
	b2.setBname(usr.getBname());
	b2.setAuthor(usr.getAuthor());
	b2.setCategory(usr.getCategory());
	b2.setCost(usr.getCost());
	b2.setStatus("active");
	HibernateManager n2=new HibernateManager();
	n2.saveBook(b2);
	resp.sendRedirect("/Library_Management/AuthBook2.jsp");

	}
}

