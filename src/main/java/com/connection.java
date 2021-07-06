package com;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.JOptionPane;

public class Connection {

		

		try {
		String url = "jdbc:mysql://localhost:3306/appcourse";
		String username = "root";  
		String password = "root123";
		
		
			Connection connection =DriverManager.getConnection(url,username,password);

			String sql="Select * FROM account";
			Statement st=connection.createStatement(); 
			ResultSet result = st.executeQuery(sql);
			
			int count=0;
			while (result.next()) {
					String ID=result.getString(1);
					String firstname=result.getString(2);
					System.out.println("name of #"+count+"/"+firstname);
					count++;
			}
			JOptionPane.showMessageDialog(null, "Connected");

			connection.close();
			
		}catch(SQLException e) {
			System.out.println("oops, Error");
			e.printStackTrace();
		}
		
}

}
