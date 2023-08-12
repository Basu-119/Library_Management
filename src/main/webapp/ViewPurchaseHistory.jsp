<%@page import="java.util.ArrayList"%>
<%@page import="com.training.hibernateservlet.beans.PurchaseHistory"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%
    ArrayList<PurchaseHistory> allPurchases = PurchaseHistory.getAllPurchasesw();

    %>

 

    <%

    for (PurchaseHistory curPur : allPurchases) { %>

        <h1>Subscription ID: <%=curPur.getPid()%></h1>

        <h1>Subscription Amount: <%=curPur.getBid()%></h1>

    <%

    }

    %>
</body>
</html>