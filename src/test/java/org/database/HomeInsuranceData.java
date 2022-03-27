package org.database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.helper.BaseClass;

public class HomeInsuranceData extends BaseClass{

	public  void sendingValuesToDatabase(String tablename,String columnname1,String columnname2,String columnname3) throws ClassNotFoundException, SQLException {
		//1.load the driver
		Class.forName("oracle.jdbc.driver.OracleDriver");
		
		//2.connect to db
		Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","hr","6374460336");
		
		//3.Write sql query
		String sql="insert into " +tablename+ "("  +columnname1+  ","  +columnname2+   "," +columnname3+  ") values ("  +toGetText(p.getNameEditBox())+ "," +toGetText(p.getMobileEditBox())+ "," +toGetText(p.getEmailEditBox())+ ")";
	
		
		//4.prepare statement
		PreparedStatement ps = con.prepareStatement(sql);
		
		//5.Execute query
		ResultSet rs = ps.executeQuery();
		
		//6.Iterate the result
		while (rs.next()) {
			String name = rs.getString(columnname1);
			String mobileNo = rs.getString(columnname2);
			String emailId = rs.getString(columnname3);
			System.out.println("DB FIrst Name : "+name);
			System.out.println("DB Mobile No  : "+mobileNo);
			System.out.println("DB Email Id   : "+ emailId);
		}
		con.close();
	}
}
