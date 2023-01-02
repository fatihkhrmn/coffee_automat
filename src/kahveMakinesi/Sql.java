package kahveMakinesi;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Sql {
	
	static Connection myConn;
	static Statement myStat;
	
	
	public static ResultSet yap() {
		// TODO Auto-generated method stub
		ResultSet myRs=null;
		try {
			 myConn = (Connection)DriverManager.getConnection("jdbc:mysql://localhost:3306/coffee","root","root");
			 myStat =(Statement) myConn.createStatement();
			myRs = myStat.executeQuery("select * from kayitolma");
			
			/*while(myRs.next()) {
				System.out.println(myRs.getString("ogrenci_no")+ " "+ myRs.getString("ogr_ad") + " "+myRs.getString("ogr_soyad") );
			}*/
		}catch(Exception e) {
			e.printStackTrace();
		}return myRs;
		
	}
	
	
	public static ResultSet yap2() {
		// TODO Auto-generated method stub
		ResultSet myRs=null;
		try {
			 myConn = (Connection)DriverManager.getConnection("jdbc:mysql://localhost:3306/coffee","root","root");
			 myStat =(Statement) myConn.createStatement();
			myRs = myStat.executeQuery("select * from secimler");
			
			
		}catch(Exception e) {
			e.printStackTrace();
		}return myRs;
		
	}

static void ekle (String sql) {
	
	try {
		 myConn = (Connection)DriverManager.getConnection("jdbc:mysql://localhost:3306/coffee","root","root");
		 myStat =(Statement) myConn.createStatement();	
      myStat.executeUpdate(sql);
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} 
	
}

static void update(String sql){
	 try {
		myStat.executeUpdate(sql);
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
}

static void sil (String sql) {
	try {
		myStat.executeUpdate(sql);
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
}

static ResultSet sorgula(String sql) {
	
ResultSet myRs =null;

try {
	myRs=myStat.executeQuery(sql);
} catch (SQLException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}

return myRs;



}
	
	
	
	

}
