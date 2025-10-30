import java.sql.*;
import java.util.Scanner;
class Update
{
public static void main(String ar[])
{
try
{
Scanner sc=new Scanner(System.in);
System.out.println("enter employee ID");
int i=Integer.parseInt(sc.nextLine());
System.out.println("enter name,designation,department,salary to be updated");
String n=sc.nextLine();
String d=sc.nextLine();
String p=sc.nextLine();
Float s=sc.nextFloat();
Class.forName("oracle.jdbc.driver.OracleDriver");
Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521/XE","system","cseds");
String q="update employee76 set ename=?,designation=?,department=?,salary=? where eid=?";
PreparedStatement ps=con.prepareStatement(q);
ps.setString(1,n);
ps.setString(2,d);
ps.setString(3,p);
ps.setFloat(4,s);
ps.setInt(5,i);
int count=ps.executeUpdate();
if(count==0)
{
System.out.println("no employee record found");
ps.close();
con.close();
}
}
catch(Exception e)
{
System.out.println(e);
}
}