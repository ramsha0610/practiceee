import java.sql.*;
class Select
{
public static void main(String ar[])
{
try
{
Class.forName("oracle.jdbc.driver.OracleDriver");
Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521/XE","system","cseds");
System.out.println("CONNECTED TO DATABASE");
String q = "select *from employee76";
Statement st = con.createStatement();
ResultSet rs = st.executeQuery(q);
while(rs.next())
{
System.out.println("ID:"+rs.getInt(1));
System.out.println("Name:"+rs.getString(2));
System.out.println("Designation:"+rs.getString(3));
System.out.println("Department:"+rs.getString(4));
System.out.println("Slary:"+rs.getInt(5));
}
rs.close();
st.close();
con.close();
}
catch(Exception e)
{
System.out.println(e);
}
}
}

