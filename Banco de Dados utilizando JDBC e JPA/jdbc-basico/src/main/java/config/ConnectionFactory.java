package config;

import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class ConnectionFactory {

    private ConnectionFactory() {
        throw new UnsupportedOperationException();
    }

    public static Connection getConnection() {

        Connection connection = null;

        try (InputStream input = ConnectionFactory.class.getClassLoader().getResourceAsStream("connection.properties")) {

            Properties properties = new Properties();
            properties.load(input);

            final String driver = properties.getProperty("jdbc.driver");
            final String dataBaseAddress = properties.getProperty("db.address");
            final String dataBaseName = properties.getProperty("db.name");
            final String user = properties.getProperty("db.user.login");
            final String password = properties.getProperty("db.user.password");

            final String connectionURL = "jdbc:" +
                    driver + "://" +
                    dataBaseAddress + "/" +
                    dataBaseName;

            try {
                connection = DriverManager.getConnection(connectionURL, user, password);
            } catch (SQLException e) {
                System.err.println(e.getMessage());
            }
        } catch (IOException e) {
            System.err.println(e.getMessage());
        }

        return connection;
    }

    public static void closeConnection(Connection connection) {

        try {
            connection.close();
        } catch (SQLException e) {
            System.err.println(e.getMessage());
        }
    }
}
