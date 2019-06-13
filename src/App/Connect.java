package App;

import java.sql.Connection;
import java.sql.DriverManager;

public class Connect {

    public Connection getConnection() {

        // Database name, username and password
        String dbaseName = "projectinfo";
        String user = "root";
        String pass = "admin";
        Connection connect = null;

        try {
            // Java Driver for connecting MySQL Database
            Class.forName("com.mysql.cj.jdbc.Driver");
            // port number is 3306
            connect = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/" + dbaseName + "?autoReconnect=true&useSSL=false", user, pass);
        } catch (Exception e) {
            e.printStackTrace();
        }

        return connect;
    }
}
