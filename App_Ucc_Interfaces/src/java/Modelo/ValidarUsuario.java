package Modelo;

import ConexionDB.DBMysql;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author JuanCamiloDev
 */
public class ValidarUsuario extends ConexionDB.DBMysql {

    public Usu validarUsu(Usu usuRecibido) throws Exception {
        
        //Mensaje de Depuración para Comprobar Obj Recibido:
        //System.out.println("usuRecibido: "+usuRecibido);
        
        Usu usuRegistrado = null;
        DBMysql con;

        //Conectarse con la B.D.:
        Connection validarCon = null;
        Statement estadoCon = null;
        ResultSet resultado = null;

        //Se crea la consulta Sql a la B.D.:
        /*Se Utiliza para pruebas
        String sql = "SELECT CORREO,PASS FROM USUARIOS WHERE CORREO = 'admin@gmail.com' "
                + "AND PASS = '123';";
        */
        String sql = "SELECT CORREO,PASS FROM USUARIOS WHERE CORREO = '" + usuRecibido.getEmail() + "' "
                + "AND PASS = '" + usuRecibido.getPass() + "'";
        
        con = new DBMysql();

        try {

            //Procesamos la conexión a la B.D.
            validarCon = con.conectar();
            estadoCon = validarCon.createStatement();
            resultado = estadoCon.executeQuery(sql);
            
            //Mensaje de Depuración de Consulta a B.D.:
            //System.out.println("resultado Query B.D.: "+resultado.next());
            //System.out.println("resultado Duplicado Query B.D.: "+resultado.next());
            
            //Valida el Resultado obtenido
            if (resultado.next() == true) {
                usuRegistrado = new Usu();
                usuRegistrado.setEmail(usuRecibido.getEmail());
                usuRegistrado.setPass(usuRecibido.getPass());
            }
            
        } catch (SQLException e) {
            System.out.println("falló la conexión, Err del Catch: " + e.getMessage());
            //Mensaje de Depuración de error:
            //System.out.println("Email: "+usuRecibido.getEmail()+" Pass: "+usuRecibido.getPass());
        } finally {
            if (resultado != null && resultado.isClosed() == false) {
                resultado.close();
            }
            resultado = null;
            if (estadoCon != null && estadoCon.isClosed() == false) {
                estadoCon.close();

            }
            estadoCon = null;
            if (validarCon != null & validarCon.isClosed() == false) {
                validarCon.close();

            }
            validarCon = null;
        }
        return usuRegistrado;
    }
}
