package Controlador;

//Imports de las clases java que están dentro de Modelo
import Modelo.Usu;
import Modelo.RegistrarUsuario;

//Imports obligatorios de un servlet
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author JuanCamiloDev
 */
@WebServlet(name = "ControlRegistro", urlPatterns = {"/ControlRegistro"})
public class ControlRegistro extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        response.setContentType("text/html;charset=UTF-8");

        //Mensajes de Referencia:
        System.out.println("\nNueva Petición de Registro\n");

        try {
            regisUsu(request, response);
        } catch (Exception e) {
            System.out.println("Error del Catch en Controlador, --> ControlRegistro: " + e);
            System.out.println("Base de Datos Desconectada :(");
            response.sendRedirect("/App_Ucc_Interfaces/mensajeConexion.jsp");
        }
        /*
        Fin (Cierre del Método doPost),
        Comentario de Referencia
         */
    }

    protected void regisUsu(HttpServletRequest request, HttpServletResponse response) throws Exception {

        //Recibimos los Datos del Usuario:
        String nomUsu = request.getParameter("nom");
        String apeUsu = request.getParameter("ape");
        String correoUsu = request.getParameter("correo");
        String passUsu = request.getParameter("pass");
        String pass2Usu = request.getParameter("pass2");
        String telUsu = request.getParameter("tel");
        
        //Mensaje de Depuración (Testing);
        /*
        System.out.println("Nombre Usuario: " + nomUsu);
        System.out.println("Apellidos Usuario: " + apeUsu);
        System.out.println("Correo Usuario: " + correoUsu);
        System.out.println("Contraseña Usuario: " + passUsu);
        System.out.println("Contraseña 2 Usuario: " + pass2Usu);
        System.out.println("Teléfono Usuario: " + telUsu);
        */
        
        //Valida si los campos están diligenciados:
        if (nomUsu != "" && apeUsu != "" && correoUsu != "" && passUsu != "" && pass2Usu != "" && telUsu != "") {
            System.out.println("Campos Diligenciados Correctamente");
            if (passUsu.equals(pass2Usu)) {
                System.out.println("Registrando al Nuevo Usuario");
                //Se crea el obj y se envian los datos con los métodos set:
                Usu usuReg = new Usu();

                usuReg.setNom(nomUsu);
                usuReg.setApe(apeUsu);
                usuReg.setEmail(correoUsu);
                usuReg.setPass(passUsu);
                usuReg.setTel(Integer.parseInt(telUsu));

                //Se instancia la clase RegistrarUsuario
                RegistrarUsuario usu = new RegistrarUsuario();
                usu.registrarUsu(usuReg);
                
                response.sendRedirect("index.jsp");
            }else{
                response.sendRedirect("/App_Ucc_Interfaces/Vistas/RegistroApp/registro.jsp");
            }

        } else {
            response.sendRedirect("/App_Ucc_Interfaces/Vistas/RegistroApp/registro.jsp");
        }

    }

}
