import java.util.ArrayList;
import java.util.List;

public class Ingresos implements Estado {

    //Atributo de tipo usuario
    Usuario usuario;
    
    //Atributo de tipo Gasto
    Gastos gasto;
    
    //Atributos de la clase
    private String detalle = null;
    private double ingreso;
    //private int contador = 0;

    //Atributos que almacenan todos los ingresos
    private List<String> totalDetalles = new ArrayList();//Almacena todos los detalles correspondientes a cada ingreso
    private List<Double> totalIngresos = new ArrayList();//Almacena la totalidad de los ingresos
   
    //Métodos Set y Get
    public Usuario getUsuario() {
        return usuario;
    }
    
    public void setUsuario(Usuario usuario) {    
        this.usuario = usuario;
    }
    
    public Gastos getGastos() {
        return gasto;
    }
    
    public void setGastos(Gastos gasto) {    
        this.gasto = gasto;
    }

    public String getDetalle() {
        return detalle;
    }

    public void setDetalle(String detalle) {
        this.detalle = detalle;
    }

    public double getIngreso() {
        return ingreso;
    }

    public void setIngreso(double ingreso) {
        this.ingreso = ingreso;
    }

    /**
     * **********************Métodos implementados de la interfaz Estado***********************
     */
    @Override
    public void agregarDatos() {

        totalDetalles.add(this.getDetalle());
        totalIngresos.add(this.getIngreso());
        
        System.out.println("\nIngreso, registrado correctamente.");
        System.out.println("------------------------------------------------------------");
    }

    @Override
    public void mostrarDatos() {
        System.out.println("\n--------------------"+ this.getUsuario().getNombreUsuario() +
                " sus Ingresos Actuales son:--------------------");
        for(int i = 0; i < totalDetalles.size(); i++){
            System.out.println("Detalle: " + totalDetalles.get(i) + " - Ingreso: $" + totalIngresos.get(i));
        }
        System.out.println("------------------------------------------------------------");
    }

    public void totalDineroCuenta() {
        
        double totalSumaIngresos = 0;
        double totalSumaGastos;
        
        for (int i = 0; i < totalIngresos.size(); i++) {
            totalSumaIngresos += totalIngresos.get(i);
        }
        
        //Traen la suma de todos los gastos
        totalSumaGastos = this.getGastos().totalSumaGastos();
        
        System.out.println("\n--------------------Dinero en la cuenta--------------------");
        System.out.println("El total de ingresos es de: $" + totalSumaIngresos);
        System.out.println("El total de gastos es de: $" + totalSumaGastos);
        System.out.println("El total de Ingresos netos en la cuenta es de: $"
                + (totalSumaIngresos - totalSumaGastos));
        System.out.println("------------------------------------------------------------");
    }

}
