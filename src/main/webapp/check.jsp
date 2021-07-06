<%@ page import="java.sql.*" %>
<%
String action =request.getParameter("lo");
if (action.equals("lo")){
	String stusername= request.getParameter("username");
	String stpassword= request.getParameter("password");
	
	try {
		//Class.forName("com.mysql.jdbc.Driver");
		String url = "jdbc:mysql://localhost:3306/appcourse";
		String username = "root";  
		String password = "root123";
		Connection con =DriverManager.getConnection(url,username,password);
		Statement st=con.createStatement();
		ResultSet rs=st.executeQuery("Select * FROM account where UserName ='"+stusername+"' and stpassword='"+password+"'");
		if(rs.next()){
			response.sendRedirect("HomeStudent.jsp");
		}
		else{
			response.sendRedirect("Home.jsp");
		}
			
	
	}
	
	catch(Exception e){
		out.print(e);
	}
}





%>
    
    
    
    
    
    
    
    
    
    
    
    
   
