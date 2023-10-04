import java.sql.*;
public class Conectar
{
    //Atributos
    private String database;
    private String username;
    private String password;
    private Connection conexion;

    //Constructor
    public Conectar(String database, String username, String password) {
        this.database = database;
        this.username = username;
        this.password = password;

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            conexion=DriverManager.getConnection("jdbc:mysql://localhost/"+database+"?serverTimezone=UTC",username,password);
        } catch (SQLException | ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

    public Connection getConexion() {
        return conexion;
    }
}
