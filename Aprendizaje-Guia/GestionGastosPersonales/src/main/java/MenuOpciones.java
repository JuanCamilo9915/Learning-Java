import java.util.Scanner;

public class MenuOpciones {
    
    private int opcion = 0;
    
    //Método que captura la opción del menú
    public int capturaOpcionMenu(){
        
        //Atributo de captura de datos por teclado(consola)
        Scanner lectura = new Scanner(System.in);
        
        //Opciones del Menú
        System.out.println("\n--------------------Capturando datos del Menú--------------------");
        System.out.println("Digite el # 1, para agregar sus ingresos");
        System.out.println("Digite el # 2, para agregar sus gastos");
        System.out.println("Digite el # 3, para mostrar sus ingresos");
        System.out.println("Digite el # 4, para mostrar sus gastos");
        System.out.println("Digite el # 5, para mostrar el total de su cuenta");
        System.out.println("Digite el # 0, para salir de la aplicación");
         System.out.println("------------------------------------------------------------");
        
        //captura la opción
        opcion = Integer.parseInt(lectura.nextLine());
        
        return opcion;
    }
    
}
