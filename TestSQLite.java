import java.sql.Connection;
import java.sql.DriverManager;

public class TestSQLite {
    public static void main(String[] args) {
        try {
            // Load the driver
            Class.forName("org.sqlite.JDBC");
            // Try connecting to your database
            Connection conn = DriverManager.getConnection("jdbc:sqlite:HospitalDB.db");
            System.out.println("✅ SQLite JAR connected successfully!");
            conn.close();
        } catch (Exception e) {
            System.out.println("❌ Connection failed: " + e.getMessage());
        }
    }
}
