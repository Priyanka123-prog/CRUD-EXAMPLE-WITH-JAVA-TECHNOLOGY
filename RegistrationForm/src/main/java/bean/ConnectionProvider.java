package bean;
import java.sql.*;

public class ConnectionProvider {
private static Connection con=getCon();
static {
	try {
		Class.forName("com.mysql.jdbc.Driver");
		con=DriverManager.getConnection("jdbc:mysql://localhost:3308/user123","root","root");
		
	}catch(Exception e) {
}
	}
public static Connection getCon() {
	return con;
}
}

