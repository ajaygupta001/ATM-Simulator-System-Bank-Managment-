package bank;
import java.sql.*;

public class Conn {

	public static void main(String[] args) throws Exception {
		
String url = "jdbc:mysql://localhost:3306/student";
String user = "ajay";
String pass = "password";
Class.forName("com.mysql.jdbc.Driver");
String query = "select * from information";
Connection c =DriverManager.getConnection(url, user, pass);
Statement st =c.createStatement();
ResultSet rs = st.executeQuery(query);

String userdata= "";
while(rs.next())
{
	userdata =rs.getString(1)+ " : " + rs.getString(2)+ " : " + rs.getString(3)+  " : " + rs.getString(4);
	System.out.println(userdata);
}
st.close();
c.close();

		
		
		
		
		
		
		
	}

}
