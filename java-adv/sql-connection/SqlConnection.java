import java.sql.*;

class SqlConnection {
  public static void main(String[] args) throws ClassNotFoundException, SQLException {
    // Defining params to connect to db
    String url = "jdbc:oracle:thin:@localhost:1521:xe";
    String username = "system";
    String password = "sayanbose123";
    
    // Loading the OracleDriver class
    Class.forName("oracle.jdbc.OracleDriver");
    
    // Connects to the db
    Connection con = DriverManager.getConnection(url, username, password);
    
    // Creates a Statement Object
    Statement st = con.createStatement();
    
    // This is the query;
    String query = "select * from Sailor;";

    // Executes Query, stores in ResultSet
    ResultSet rs = st.executeQuery(query);

    System.out.println(rs);

    // Closing the connections
    con.close();
    st.close();
  }
}