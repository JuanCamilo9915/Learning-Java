import java.util.Scanner;

public class Usuario implements Estado {

    //Datos del usuario
    private String nombreUsuario;
    private int edad;
    private int dni;
    
    //Atributo de captura de datos por teclado(consola)
    private Scanner lectura = new Scanner(System.in);
 
    //Métodos Get y Set
    public String getNombreUsuario() {
        return nombreUsuario;
    }

    public void setNombreUsuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    /***********************Métodos implementados de la interfaz Estado************************/
    @Override
    public void agregarDatos() {   
        
        System.out.println("--------------------Capturando datos del Usuario--------------------");
        do{
            System.out.println("Introduce el nombre del usuario");
            nombreUsuario=lectura.nextLine().toUpperCase();
        }while(nombreUsuario.isEmpty());
        this.setNombreUsuario(nombreUsuario);//Se registra el nombre
        
        do{
            System.out.println("Introduce la edad del usuario");
            edad=Integer.parseInt(lectura.nextLine());
            
        }while(edad<=18 && edad>77);
        this.setEdad(edad);//Se registra la edad
        
        do{
            System.out.println("Introduce el DNI del usuario");
            dni=Integer.parseInt(lectura.nextLine());
            
        }while(dni<=0);
        this.setDni(dni);//Se registra el dni
        System.out.println("------------------------------------------------------------\n");
                
    }

    @Override
    public void mostrarDatos() {
        System.out.println("El usuario dueño de la cuenta es: " + this.nombreUsuario + " de " + this.edad + " años" +
                ", \ncon DNI: " + this.dni);
    }
         
}
