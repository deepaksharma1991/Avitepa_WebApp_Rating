package com.wipro;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/StudentData")
public class StudentData extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private StudentDataLoad sdl;      
  
    public StudentData() {
    	sdl = new StudentDataLoad();
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{	
		int cnt = 1;
		sdl.loadStudentData();
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		out.print("<html><body>");
		out.print("<h1>Students Data : </h1>");
		out.println();
		out.println();
		out.print("<table border=1>");
		out.print("<tr><th>Sr No</th><th>Student Name</th><th>Subject</th><th>Assignemt Category</th><th>Points</th></tr>");
		
		for(Student s : sdl.studentList) {
			out.print("<tr><td>" + cnt + "</td><td>" + s.getName() + "</td><td>" + s.getSubject() 
			           + "</td><td>" + s.getAssignCat() + "</td><td>" + s.getPoints() + "</td></tr>");	
			cnt++;
		}
		out.print("</table>");
		out.print("</body></html>");
	}
}
