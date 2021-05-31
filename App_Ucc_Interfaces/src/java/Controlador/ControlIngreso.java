package Controlador;

//Imports de las clases java que están dentro de Modelo
import Modelo.Usu;
import Modelo.ValidarUsuario;

//Imports obligatorios de un servlet
import java.io.IOException;
/*import static java.lang.System.out;
import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;*/
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author JuanCamiloDev
 */
@WebServlet(name = "ControlIngreso", urlPatterns = {"/ControlIngreso"})
public class ControlIngreso extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        response.setContentType("text/html;charset=UTF-8");

        //Controlamos la acción:
        String ejecutar = request.getParameter("accion");

        //Mensajes de Referencia:
        System.out.println("\nNueva Ejecución del Programa :)\n");
        //Mensaje de Prueba, para validar valor enviado desde el form de inicio de sesión
        System.out.println("Ejecutar: " + ejecutar);
        try {
            if (ejecutar != null) {
                //System.out.println("Ejecutar 2: " + ejecutar);
                validarUsuC(request, response);

            } else {
                response.sendRedirect("index.jsp");
            }
        } catch (Exception e) {
            System.out.println("Error del Catch en Controlador, --> ControlIngreso: " + e);
            System.out.println("Base de Datos Desconectada :(");
            response.sendRedirect("mensajeConexion.jsp");
        }
        /*
        Fin (Cierre del Método doPost),
        Comentario de Referencia
         */
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        response.setContentType("text/html;charset=UTF-8");

        //Controlamos la acción:
        String ejecutar = request.getParameter("accion");

        //Mensajes de Referencia:
        System.out.println("\nNueva Petición Get para Cerrar Sesión\n");
        //Mensaje de Prueba, para validar valor enviado desde el form de inicio de sesión
        System.out.println("Ejecutar: " + ejecutar);

        //Cerramos la sesión de cada usuario:
        HttpSession sesion = request.getSession();
        sesion.setAttribute("visitante", null);
        sesion.invalidate();
        response.sendRedirect("index.jsp");

    }

    //---------------------------------------------------------------------------------------------------------------------------
    //Metodos de Inicio Sesión:
    protected void validarUsuC(HttpServletRequest request, HttpServletResponse response) throws Exception {

        //Creamos la sesión de cada usuario:
        HttpSession sesion;
        //Creamos el obj Validar Usuario:
        ValidarUsuario validarU;
        Usu datosUsu;
        //System.out.println("Dentro del método validarUsuC");
        datosUsu = enviarUsuario(request);
        
        //datosUsu = this.obtenerUsuario(request);
        System.out.println("datosUsu: " + datosUsu);
        validarU = new ValidarUsuario();

        datosUsu = validarU.validarUsu(datosUsu);

        //Mensaje de Prueba
        //System.out.println("datosUsu, afuera del if: "+datosUsu);
        //System.out.println("datosUsu Validado, fuera del if: " + datosUsu);
        
        if (datosUsu != null) {

            sesion = request.getSession();
            sesion.setAttribute("visitante", datosUsu);
            request.setAttribute("msje", "Bienvenido");
            
            this.getServletConfig().getServletContext().getRequestDispatcher("/Vistas/VistasApp/home.jsp").forward(request, response);

        } else {
            request.setAttribute("msje", "Usuario y/o contrasena Incorrectas");
            request.getRequestDispatcher("index.jsp").forward(request, response);

        }

    }

    private Usu enviarUsuario(HttpServletRequest request) {
        Usu usuario = new Usu();

        usuario.setEmail(request.getParameter("campoUsuario"));
        usuario.setPass(request.getParameter("campoClave"));

        return usuario;
    }

}
