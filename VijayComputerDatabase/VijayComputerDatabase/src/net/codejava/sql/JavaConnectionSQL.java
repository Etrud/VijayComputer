package net.codejava.sql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;



public class JavaConnectionSQL {

		static String url = "jdbc:sqlserver://cot-cis3365-03\\VIJAYCOMPUTER";
		static String user = "sa";
		static String password = "Cougarnet2020!";

		public JavaConnectionSQL()
		{

			connect();
		}
		
		public JavaConnectionSQL(String user, String password)
		{
			
		}
		
		
		public static void connect()
		{
			try {
				Connection connection = DriverManager.getConnection(url,user,password);
				System.out.println("IT DID Connect");
			} catch (SQLException e) {
				System.out.println("Didn't Connect");
				e.printStackTrace();
			}
		}
		
		public static void connect(String name, String pass)
		{
			try {
				Connection connection = DriverManager.getConnection(url,name,pass);
				System.out.println("IT DID Connect");
			} catch (SQLException e) {
				System.out.println("Didn't Connect");
				e.printStackTrace();
			}
		}
		

}


