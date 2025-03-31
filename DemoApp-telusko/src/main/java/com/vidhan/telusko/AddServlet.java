package com.vidhan.telusko;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class AddServlet extends HttpServlet{
 public void doPost(HttpServletRequest req, HttpServletResponse res) throws IOException
 {
	 int i=Integer.parseInt(req.getParameter("num1"));
	 int j=Integer.parseInt(req.getParameter("num2"));
	 int k=i+j; 
	 PrintWriter out=res.getWriter();
     out.println("this the answer"+k);
 }
 public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException
 {
	 int i=Integer.parseInt(req.getParameter("num1"));
	 int j=Integer.parseInt(req.getParameter("num2"));
	 int l=i-j; 
	 PrintWriter out=res.getWriter();
     out.println("this is for get call answer"+l);
     RequestDispatcher rd=req.getRequestDispatcher("sq");
     rd.forward(req, res);
 }
}
