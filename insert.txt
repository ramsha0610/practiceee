import java.sql.*;
class Insert
{
public static void main(String ar[])
{
try
{
Class.forName("oracle.jdbc.driver.OracleDriver");
Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521/XE","system","cseds");
String q1="insert into employee76 values(101,'ramsha','eng','ds',90000)";
String q2="insert into employee76 values(102,'sindhu','pg','csbs',80000)";
Statement st=con.createStatement();
int c=st.executeUpdate(q1);
c=c+st.executeUpdate(q2);
if(c>0)
{
System.out.println("Records inserted:"+c);
st.close();
con.close();
}
}
catch(Exception e)
{
System.out.println(e);
}
}
}