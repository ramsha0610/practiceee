import java.sql.*;
import java.util.Scanner;

class PsDelete {
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter employee ID:");
            int i = Integer.parseInt(sc.nextLine());

            Class.forName("oracle.jdbc.driver.OracleDriver");
            Connection con = DriverManager.getConnection(
                "jdbc:oracle:thin:@localhost:1521/XE", "system", "cseds"
            );
            System.out.println("CONNECTED TO DATABASE");

            String q = "DELETE FROM employee76 WHERE eid=?";
            PreparedStatement ps = con.prepareStatement(q);
            ps.setInt(1, i); // Corrected

            int count = ps.executeUpdate();
            if (count == 0)
                System.out.println("No employee record found");
            else
                System.out.println("Employee record deleted");

            ps.close();
            con.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}