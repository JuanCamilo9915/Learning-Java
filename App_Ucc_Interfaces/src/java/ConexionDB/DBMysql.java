package ConexionDB;

import java.sql.Connection;
import java.sql.DriverManager;

//Importando el controlador:
import Controlador.ControlIngreso;

/**
 *
 * @author JuanCamiloDev
 */
public class DBMysql {
    private final String baseDatos = "app-ucc-interfaces";
    private final String servidor = "jdbc:mysql://localhost/" + baseDatos;
    private final String usuario = "root";
    private final String clave = "";
    
    public Connection conectar(){
        Connection cn = null;
        try{
            Class.forName("com.mysql.jdbc.Driver");
            cn = DriverManager.getConnection(servidor, usuario, clave);
        }catch(Exception e){
            System.out.println("Error al conectar la B.D. (No Conectada): " + e.getMessage());
            System.out.println("cn: "+cn);
        }
        return cn;
    }
}
