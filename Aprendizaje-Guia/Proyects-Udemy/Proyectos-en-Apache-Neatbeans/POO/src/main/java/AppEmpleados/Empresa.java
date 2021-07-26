package AppEmpleados;

/**
 *
 * @author JuanCamiloDev
 */
public class Empresa {
    
    public static void main(String[] args) {
        
        DetallesEmpleados dEmpleados = new DetallesEmpleados("Juan Camilo",3000000,"TI");
        
        System.out.println("Detalles del Trabajador: " + dEmpleados.toString());
        
        dEmpleados.setName("Tania");
        dEmpleados.setSalary(478000);
        dEmpleados.setDepartmentBusiness("Gerencia");
        
        System.out.println("Detalles del Trabajador: " + dEmpleados);//println por defecto llama a toString, sin especificarlo
        
    }
    
}
