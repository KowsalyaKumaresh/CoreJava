package com.chainsys.webapp.first;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class SessionState
 */
public class SessionState extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public SessionState() {
		super();

	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		PrintWriter out = response.getWriter();
		response.setContentType("text/html");
		out.println("<html><head><title>Attributes</title></head><body>");
		String submitvalue = request.getParameter("submit");
		HttpSession session =request.getSession(true);  // Stateless conecton= every round server will restart
         System.out.println(session.getId());     
         // session tracking= create a session id (token )for follow the user
		
         if(submitvalue.equals("result")) {
        	// response.sendRedirect("Result");// Navigating from one servelt to another servelt within in the same webpage
        	 //response.sendRedirect("http://www.google.com"); //can't be also be used to navigate another webpage

             RequestDispatcher rd=request.getRequestDispatcher("Result");     // 	 Navigating from one servelt to another servelt within in the same webpage
              // can't be also be used to navigate another website.
             rd.forward(request, response);   // Parsing the request and response object received by the current servlet to the forwarded servlet.
         
         }
         else if (submitvalue.equals("set")) {
			String salaryInput = request.getParameter("salary");
		    session.setAttribute("salary", salaryInput); // storing data in session scope for each user.
			                                            // seesion.attributes store the data in a collection using key and value
		                                               // salary="key" ; salaryInput="value"; 
		    out.println("<h1>value set</h1>" + salaryInput);
		
		}

		else if (submitvalue.equals("fetch")) {
			String sessionSalary= session.getAttribute("salary").toString();
			if(sessionSalary==null) {
				out.print("<h1>SESSION NOT YET SET</h1>");
			}
		     //String sessionSalary=(String) session.getAttribute("salary").toString();
			else {
			out.println("<h1>value fetched</h1>" + sessionSalary); // returning value from sessionAttribute  to html
		}

		out.println("</body></html>");
	}}
	}

//***** access from multiple server but any one.
