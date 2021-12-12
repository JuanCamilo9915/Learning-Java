package Modelo;

import ConexionDB.DBMysql;
import com.sun.org.slf4j.internal.Logger;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
/**
 *
 * @author JuanCamiloDev
 */
public class RegistrarUsuario {
    
    public Usu registrarUsu(Usu usuInsert) throws Exception {
        
        //Mensaje de Depuración para Comprobar Obj Recibido:
        //System.out.println("usuRecibido: "+usuRecibido);
        
        Usu usuRegistrando = null;
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
        String sql = "SELECT CORREO,PASS FROM USUARIOS WHERE CORREO = '" + usuInsert.getEmail() + "' "
                + "AND PASS = '" + usuInsert.getPass() + "'";
        
        con = new DBMysql();

        try {

            //Procesamos la conexión a la B.D.
            PreparedStatement insertarUsu = null;
            validarCon = con.conectar();
            estadoCon = validarCon.createStatement();
            resultado = estadoCon.executeQuery(sql);
            
            //Mensaje de Depuración de Consulta a B.D.:
            //System.out.println("resultado Query B.D.: "+resultado);
            
            //Valida el Resultado obtenido
            if (resultado.next() == true) {
                System.out.println("Usuario ya esta Registrado");
            }else{                
                String sqlInsert = "INSERT INTO usuarios VALUES(?,?,?,?,?)";
                
                try {
                    
                    insertarUsu = validarCon.prepareStatement(sqlInsert);
                    
                    insertarUsu.setString(1, usuInsert.getNom());
                    insertarUsu.setString(2, usuInsert.getApe());
                    insertarUsu.setString(3, usuInsert.getEmail());
                    insertarUsu.setString(4, usuInsert.getPass());
                    insertarUsu.setInt(5, usuInsert.getTel());
                    
                    insertarUsu.execute();
                    
                    insertarUsu.setEscapeProcessing(true);
                    
                } catch (Exception e) {
                    System.out.println("dss");
                    insertarUsu.setEscapeProcessing(false);
                }
            }

        } catch (Exception e) {
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
        return usuInsert;
    }
    
    
}
