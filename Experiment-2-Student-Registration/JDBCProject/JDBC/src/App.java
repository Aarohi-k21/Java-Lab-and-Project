import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class App {

    public static void main(String[] args) {

        String url = "jdbc:mysql://localhost:3306/college";
        String username = "root";
        String password = "Mysql@123";

        try {

            Connection con = DriverManager.getConnection(
                url,
                username,
                password
            );

            String sql = "INSERT INTO students (id, name, age) VALUES (?, ?, ?)";

            PreparedStatement pst = con.prepareStatement(sql);

            pst.setInt(1, 1);
            pst.setString(2, "Aarohi");
            pst.setInt(3, 20);

            pst.executeUpdate();

            System.out.println("Student added successfully!");

            con.close();

        } catch (Exception e) {

            System.out.println(e);

        }
    }
}