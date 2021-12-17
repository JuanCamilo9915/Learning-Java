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
    private final String baseDatos = "appuccinterfaces";
    private final String servidor = "jdbc:mysql://localhost/" + baseDatos;
    private final String usuario = "root";
    private final String clave = "";
    
    public Connection conectar(){
        Connection cn = null;
        try{
            //Class.forName("com.mysql.jdbc.Driver"); --> está obsoleta
            Class.forName("com.mysql.cj.jdbc.Driver");//Está es la forma actual
            cn = DriverManager.getConnection(servidor, usuario, clave);
        }catch(Exception e){
            System.out.println("Error al conectar la B.D. (No Conectada): " + e.getMessage());
            System.out.println("cn: "+cn);
        }
        return cn;
    }
}
