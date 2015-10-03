import java.sql.*;
public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Connection myConn;
		Statement myStmt;
		ResultSet myRes;
		//Get mysql connection
		String url = "jdbc:mysql://localhost:3306/mydb";
		String usrid = "test";
		String pswd = "demo";
		try {
			//Get mysql connection
			myConn = DriverManager.getConnection(url,usrid,pswd);
		
			//Create a stmt
			myStmt = myConn.createStatement();
			
			//Execute SQL Query
			String query = "select * from employee";
			myRes = myStmt.executeQuery(query);
			
			//Process Result Set
			while(myRes.next()){
				System.out.println("Last Name is "+ myRes.getString(1)+", First Name is "
						+ myRes.getString(2));
			}
			
			
		} catch (Exception e){
			System.out.println(e.toString());
		}
		
		
		
		

	}

}
