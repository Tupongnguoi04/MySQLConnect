package nguoi.dev;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Connection;

public class MainApp {

    public static void main(String[] args) throws SQLException {
        // TODO Auto-generated method stub
        final String DB_URL = "jdbc:mysql://localhost:3306/shop";
        final String USER = "root";
        final String PASS = "";
        
        try {
            // Load MySQL JDBC driver
            Class.forName("com.mysql.cj.jdbc.Driver");
            System.out.println("JDBC Driver loaded successfully.");

            // Establish connection to the database
            Connection connection = DriverManager.getConnection(DB_URL, USER, PASS);
            System.out.println("Connected to the database successfully!");

            // Additional output
            System.out.println("Hello baby, welcome to the database connection!");

            // Close connection
            connection.close();
            System.out.println("Database connection closed.");
        } catch (Exception e) {
            // Handle errors for Class.forName
            e.printStackTrace();
        }
    }
}
