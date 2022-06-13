package com.wipro;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.LinkedHashMap;
import java.util.Map;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/Student")
public class StudentServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private StudentDataLoad sdl; 
	private StudentCalculator stuCal;
   
    public StudentServlet() {
        super();
        sdl = new StudentDataLoad();
        stuCal = new StudentCalculator();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		sdl.loadStudentData();
		
		String studentName = request.getParameter("name");
		
		Map<String,LinkedHashMap<String,Float>> outputMap = stuCal.studentAvg(sdl.studentList,studentName);
		PrintWriter out = response.getWriter();
		
		if(outputMap == null) {
			out.println("Student named " + studentName + " doesn't exists :");
		}
		else {
		out.print("<html><body>");
		out.print("<h1>Student :" +  studentName + "</h1>");
		out.println();
		out.println();
		out.print("<table border=1>");
		out.print("<tr><th>Subject</th><th>Test Score</th><th>Quiz Score</th><th>Lab Score</th><th>Project Score</th><th>OverAll Rating</th></tr>");
		
		for(String key : outputMap.keySet())
		{ 
			LinkedHashMap<String,Float> lhm = outputMap.get(key);
			
			out.print("<tr><td>" + key + "</td>");	
			for(String key2 : lhm.keySet()) {
				if(lhm.get(key2) == 0) {
					out.print("<td>" + "NA" + "</td>");
				}else {
					out.print("<td>" + lhm.get(key2) + "</td>");
				}
			}
		    out.print("</tr>");
		}
		
		out.print("</table></body></html>");
	}
  }
}
