import java.sql.*;
import java.util.Scanner;

class PsInsert {
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter employee details:");
            int i = Integer.parseInt(sc.nextLine());
            String n = sc.nextLine();
            String d = sc.nextLine();
            String p = sc.nextLine();
            float s = sc.nextFloat();

            Class.forName("oracle.jdbc.driver.OracleDriver");
            Connection con = DriverManager.getConnection(
                "jdbc:oracle:thin:@localhost:1521/XE", "system", "cseds"
            );
            System.out.println("CONNECTED TO DATABASE");

            String q = "insert into employee76 values(?,?,?,?,?)";
            PreparedStatement ps = con.prepareStatement(q);
            ps.setInt(1, i);
            ps.setString(2, n);
            ps.setString(3, d);
            ps.setString(4, p);
            ps.setFloat(5, s);

            int count = ps.executeUpdate();
            System.out.println("Row Inserted: " + count);

            ps.close();
            con.close();
        } 
	catch (Exception e) {
         	   System.out.println(e);
        }
    }
}