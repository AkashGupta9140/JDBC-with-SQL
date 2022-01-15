package com.insert.query;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class InsertQuery {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Connection con = null;
		Statement st = null;
		String query = null;

		// Create Scanner Object
		Scanner sc = new Scanner(System.in);

		// Taken Serial Number from user
		System.out.println("Enter your Sr no:: ");
		int srno = sc.nextInt();

		// Taken Item Name from user
		System.out.println("Enter your Item Name:: ");
		String items = sc.next();

		// Cover Item name with single Quotes
		items = "'" + items + "'";

		// Taken Quantity from User
		System.out.println("Enter Quent. :: ");
		int quantity = sc.nextInt();

		// Exception Handling Using try catch blocks
		// Riskey code inside try block
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "AkashGupta", "AkashGupta");
			st = con.createStatement();
			query = "insert into gold_diamond values(" + srno + "," + items + "," + quantity + ")";
			int result = st.executeUpdate(query);
			if (result == 1) {
				System.out.println("1 Row Inserted");
			} else {
				System.out.println("Row Insertion Failed");
			}

		}
		// Handling code Inside Catch Block
		catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
		// which code execute any situation then we should write this code inside
		// finally block
		finally {
			try {
				st.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			try {
				con.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}
	}

}
