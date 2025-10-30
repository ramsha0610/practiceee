import java.sql.*;
class Create
{
public static void main(String ar[])
{
try
{
Class.forName("oracle.jdbc.driver.OracleDriver");
Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521/XE","system","cseds");
System.out.println("CONNECTED TO DATABASE");
String q = "create table employee76(eid number,ename varchar2(30),designation varchar2(30),department varchar2(30),salary float)";
Statement st=con.createStatement();
int c=st.executeUpdate(q);
System.out.println("Table created in DataBase");
st.close();
con.close();
}
catch(Exception e)
{
//e.printStackTrace();
System.out.println(e);
}
}
}
