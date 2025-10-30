import java.sql.*;
import java.util.Scanner;
class Callable{
public static void main(String ar[])
{
try
{
Scanner sc= new Scanner(System.in);
System.out.println("enter employee76 details(id,name,designation,department,salary)");
int i=Integer.parseInt(sc.nextLine());
String n=sc.nextLine();
String d=sc.nextLine();
String p=sc.nextLine();
Float s=sc.nextFloat();
Class.forName("oracle.jdbc.driver.OracleDriver");
Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521/XE","system","cseds");
System.out.println("Connected to DataBase");
String q="{call InsertEmployee(?,?,?,?,?)}";
CallableStatement cs=con.prepareCall(q);
cs.setInt(1,i);
cs.setString(2,n);
cs.setString(3,d);
cs.setString(4,p);
cs.setFloat(5,s);
int count=cs.executeUpdate();
System.out.println("procedure invoked and record inserted");
cs.close();
con.close();
}
catch(Exception e)
{
System.out.println(e);
}
}