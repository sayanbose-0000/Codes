import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class SqlConnection {
  public static void main(String[] args) {
    String url = "jdbc:postgresql://localhost:5432/testdb";
    String username = "postgres";
    String password = "sayanbose123";

    try (Connection conn = DriverManager.getConnection(url, username, password)) {
      if (conn != null) {
        System.out.println("Connection successful");
      }
    } catch (SQLException sqle) {
      System.out.println(sqle);
    }
  }
}
