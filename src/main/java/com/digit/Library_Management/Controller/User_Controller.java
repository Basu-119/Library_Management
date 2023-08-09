package com.digit.Library_Management.Controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.digit.Library_Management.Model.HibernateManager;
import com.digit.Library_Management.Model.UsersReq;

@WebServlet("/addUser")
public class User_Controller extends HttpServlet{
@Override
protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

	String uname = req.getParameter("uname");

	String pwd = req.getParameter("pwd");
	String address = req.getParameter("address");
	String email = req.getParameter("email");
	int phone =Integer.parseInt(req.getParameter("phone"));
	
	UsersReq ur=new UsersReq();
	ur.setUname(uname);
	ur.setPwd(pwd);
	ur.setEmail(email);
	ur.setPhone(phone);
	ur.setStatus("inactive");
	HibernateManager hbn=new HibernateManager();
	hbn.saveUserreq(ur);
	resp.sendRedirect("/Library_Management/BookReqSucc.jsp");

}
}
