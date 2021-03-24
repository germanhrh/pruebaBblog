package co.com.test.bblog.util;

import oracle.jdbc.driver.OracleDriver;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class ConexionBDOracle {

    private Connection connection;

    public Connection getConnection() {
        return connection;
    }

    public void registrarDriver() throws SQLException {
        OracleDriver oracleDriver = new oracle.jdbc.driver.OracleDriver();
        DriverManager.registerDriver(oracleDriver);
    }

    public void conectarQA() throws SQLException {
        String url = "Servidor";
        if (connection == null || connection.isClosed()) {
            String cadenaConexion = "jdbc:oracle:thin:@" + url + ":" + "Puerto"  + "/" + "SID";
            registrarDriver();
            connection = DriverManager.getConnection(cadenaConexion, "User", "Passew");
        }
    }


    public void cerrar() throws SQLException {
        if (connection != null && !connection.isClosed()) {
            connection.close();
        }
    }

}
