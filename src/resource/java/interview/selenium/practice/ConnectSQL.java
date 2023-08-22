package interview.selenium.practice;

import java.sql.*;

public class ConnectSQL {
	public static void main(String[] args) throws Exception {
		//Connection URL Syntax: "jdbc:mysql://ipaddress:portnumber/db_name"		
        String dbUrl = "jdbc:sqlserver://BUILD3\\SQLEXPRESS;databaseName=DhruvInterviewPractice";					
System.out.println("connection established");
		//Database Username		
		String username = "BUILD3\\ghaya";	
        
		//Database Password		
		String password = "";				

		//Query to Execute		
		String query = "select *  from Table_1";	
        
 	    //Load mysql jdbc driver		
   	    //Class.forName("com.mysql.jdbc.Driver");			
   
   		//Create Connection to DB		
    	Connection con = DriverManager.getConnection(dbUrl,username,password);
  
  		//Create Statement Object		
	   Statement stmt = con.createStatement( );					

			// Execute the SQL Query. Store results in ResultSet		
 		ResultSet rs= stmt.executeQuery(query);							
 
 		// While Loop to iterate through all data and print results		
		while (rs.next()){
	        		String myName = rs.getString(1);								        
                    String myAge = rs.getString(2);					                               
                    System. out.println(myName+"  "+myAge);		
            }		
			 // closing DB Connection		
		//	con.close();			
}
		
	}
