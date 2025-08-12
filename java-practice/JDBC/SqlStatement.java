import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class SqlStatement {
  public static void main(String[] args) {
    String url = "jdbc:postgresql://localhost:5432/testdb";
    String username = "postgres";
    String password = "sayanbose123";

    try (Connection conn = DriverManager.getConnection(url, username, password)) {
      String sql = "select * from employee";
      Statement s = conn.createStatement();

      ResultSet rs = s.executeQuery(sql);

      while (rs.next()) {
        int id = rs.getInt("id");
        String name  = rs.getString("name");
        long salary = rs.getLong("salary");

        System.out.println(id + " | " + name + " | " + salary);
      }

    } catch (SQLException sqle) {
      System.out.println(sqle);
    }
  }
}
