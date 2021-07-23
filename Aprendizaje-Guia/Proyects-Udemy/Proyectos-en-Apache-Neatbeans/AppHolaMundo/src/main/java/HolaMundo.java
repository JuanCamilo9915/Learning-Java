
import java.util.Scanner;


/**
 * @author JuanCamiloDev
 */
public class HolaMundo {

    public static void main(String[] args) {
        //Atributos de la clase:
        String cadena = "Hola Mundo en Java!, utilizando una variable de tipo cadena";
        //var despedida = "Hasta pronto amigo"; --> Esta opción solo esta disponible para las versiones del jdk 10 en adelante

        System.out.println(cadena);
        System.out.println(cadena);
        System.out.println(cadena);

        //-------------------------------------------------------------------------------------------------------------------------
        System.out.println("\n-----------------------------------New Program-----------------------------------\n");
        //-------------------------------------------------------------------------------------------------------------------------
        String namePerson = "Juan Camilo";
        String greeting = "Hola, ¿Como estás?";

        System.out.println(greeting + " " + namePerson);

        //-------------------------------------------------------------------------------------------------------------------------
        System.out.println("\n-----------------------------------New Program-----------------------------------\n");
        //-------------------------------------------------------------------------------------------------------------------------
        int num1 = 7, num2 = 10;

        System.out.println("La suma es: " + num1 + num2);
        System.out.println("La suma 2 es: " + (num1 + num2));
        System.out.println(num1 + num2 + "La suma es: ");
        
        //-------------------------------------------------------------------------------------------------------------------------
        System.out.println("\n-----------------------------------New Program-----------------------------------\n");
        //-------------------------------------------------------------------------------------------------------------------------
        String name = "Juan Camilo", lastName = "González Duque";
        
        System.out.println("Estudent: \t" + "\'" + name + "\" \b'" + lastName);
        
        //-------------------------------------------------------------------------------------------------------------------------
        System.out.println("\n-----------------------------------New Program-----------------------------------\n");
        //-------------------------------------------------------------------------------------------------------------------------
        Scanner input = new Scanner(System.in);
        Scanner input2 = new Scanner(System.in);
        
        System.out.println("Ingrese un dato");
        String inputUser = input.next();
        String inputUser2 = input2.nextLine();
        
        System.out.println("El usuario ingreso el siguiente dato: "+ inputUser + " y " + inputUser2);
    }
}
