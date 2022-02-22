import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class Main {

    private static String baseURL = "jdbc:mysql://127.0.0.1:8889";
    private static String schemaName = "classDemo";
    private static String fullURL = baseURL+schemaName;
    private static String username = "guipia";
    private static String password = "Saint123";
    private static Connection  connection = null;

    public static void createDatabase(String name) throws SQLException {
        connection = DriverManager.getConnection(baseURL, username, password);
        Statement stmt = null;
        stmt = connection.createStatement();
        String command = "CREATE DATABASE" + name;
        //String sql = "CREATE TABLE customer(first_name VARCHAR(30) NOT NULL, id INT UNSIGNED NOT NULL AUTO_INCREMENT PRIMARY KEY)";
            stmt.execute(command);
            System.out.println("Table created successfully");

            /*
            Connection object
                Statement object pulled from connection object
                    put String(the sql command) into the statement object
             */
    }

    public static ArrayList<GradYear> getGradyear)() throws SQLException{
    connection = DriverManager.getConnection(baseURL, username, password);
    Statement stmt = connection.createStatement();
    String sqlCommand = "";
    stmt.execute(sqlCommand);
    return null;
    }
}
