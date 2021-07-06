package com;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.catalina.mbeans.UserMBean;

/**
 * Servlet implementation class Login
 */
public class Login extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	private static final String SELECT_SQL_Admin= "SELECT * FROM account where TypeOfUser = \"Admin\"  ";
	private static final String SELECT_SQL_Techer= "SELECT * FROM account where TypeOfUser = \"Techer\"  ";
	private static final String SELECT_SQL_Student= "SELECT * FROM account where TypeOfUser = \"Student\"  ";

	

    public Login() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
			
		//PrintWriter out = response.getWriter();
		
		try {
			
			Connection connection = connectDatabase.getConnection();
					
			Statement statement = connection.createStatement();
			
			ResultSet rs = statement.executeQuery(SELECT_SQL_Admin);
			
			
			PrintWriter out = response.getWriter();
			
			 			
			

			while(rs.next()) {
				
				out.println("<tr>");
				out.println("<td>"+ rs.getInt("ID")+"</td>");
				out.println("<td>"+rs.getString("FirstName")+"</td>");
				out.println("<td>"+rs.getString("UserName")+"</td>");
				out.println("<td>"+rs.getString("Password")+"</td>");
				out.println("<td>"+rs.getString("TypeOfUser")+"</td>");
				out.println("</tr>");
				
			}
			
			rs.close();
			statement.close();
			connection.close();
			
			/*UserMBean user = new UserMBean();
			
			
			
			
			 user.setUserName(request.getParameter("username"));
		     user.setPassword(request.getParameter("password"));

		     user = UserDAO.login(user);
		     
		     if (user.isValid())
		     {
			        
		          HttpSession session = request.getSession(true);	    
		          session.setAttribute("currentSessionUser",user); 
		          response.sendRedirect("HomeStudent.jsp"); //logged-in page      		
		     }
			        
		     else 
		          response.sendRedirect("Home.jsp"); //error page 
		   */
			
			
			
		} catch (Throwable theException) {
			//response.sendRedirect("Home.jsp");
			System.out.println(theException);
		}
	
		
		
	}
	
	
	
	
	
	
	

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		
		String username= request.getParameter("username");
		String password= request.getParameter("password");

		out.print("<b>Hello</b> "+username);

	
	}

}
