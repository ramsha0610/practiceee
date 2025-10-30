import java.sql.*;
import java.util.Scanner;

class PsSelect {
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

            String q = "select * from employee76 where eid=?";
            PreparedStatement ps = con.prepareStatement(q);
            ps.setInt(1, i); // Corrected

            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                System.out.println(
                    rs.getInt(1) + " " +
                    rs.getString(2) + " " +
                    rs.getString(3) + " " +
                    rs.getString(4) + " " +
                    rs.getFloat(5)
                );
            } else {
                System.out.println("No record found");
            }

            rs.close();
            ps.close();
            con.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}