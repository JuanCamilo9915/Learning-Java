package Modelo;

import ConexionDB.DBMysql;
/**
 *
 * @author JuanCamiloDev
 */
public class ComprobarConexionDB {
    public static void main(String[] args) {
        DBMysql db = new DBMysql();
        
        db.conectar();
        System.out.println(db.conectar());
    }
}
