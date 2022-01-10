package AppPersonas;

/**
 *
 * @author JuanCamiloDev
 */
public class InicioPrograma {
    
    public static void main(String[] args) {
        //Creando Obj de la clase Persona
        Persona p1 = new Persona();
        Persona p2 = new Persona("Fabio", "Espinoza Corrales", "Universidad Santiago de Cali", "Ing. de Sistemas");
        
        //Modificando los atributos de la clase Persona
        p1.name = "Juan Camilo";//Hacerlo de esta menara NO es buena practica
        p1.lastName = "González Duque";
        
        /*p2.name = "Fabio";//Hacerlo de esta menara NO es buena practica
        p2.lastName = "Espinoza Corrales";*/
        
        //Llamando a los métodos de la clase Persona
        System.out.println("Obj Persona 1:");
        p1.displayName();
        String infoAcaP1 = p1.datosAcademicos("Universidad Cooperativa de Colombia", "Ing. de Sistemas");
        System.out.println("Info Académica: " + infoAcaP1);
        
        System.out.println("\nObj Persona 2:");
        p2.displayName();
        String infoAcaP2 = p2.datosAcademicos2();
        System.out.println("Info Académica: " + infoAcaP2);
    }
    
}
