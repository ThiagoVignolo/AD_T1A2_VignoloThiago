import java.sql.*;

public class Main {
    public static void main(String[] args)
    {
        Conectar conector = new Conectar("tiendas", "root", "root");
        Connection conexion = conector.getConexion();
    }
}