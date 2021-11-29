import java.util.ArrayList;
import java.util.List;

public class Gastos implements Estado {

    //Atributo de tipo usuario
    Usuario usuario;

    //Atributos de la clase
    private String detalle = null;
    private double gasto;

    //Atributos que almacenan todos los ingresos
    private List<String> totalDetalles = new ArrayList();//Almacena todos los detalles correspondientes a cada ingreso
    private List<Double> totalGastos = new ArrayList();//Almacena la totalidad de los ingresos

    //Métodos Set y Get
    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public String getDetalle() {
        return detalle;
    }

    public void setDetalle(String detalle) {
        this.detalle = detalle;
    }

    public double getGasto() {
        return gasto;
    }

    public void setGasto(double gasto) {
        this.gasto = gasto;
    }

    /***********************Métodos implementados de la interfaz Estado************************/
    @Override
    public void agregarDatos() {

        totalDetalles.add(this.getDetalle());
        totalGastos.add(this.getGasto());

        System.out.println("\nGasto, registrado correctamente.");
        System.out.println("------------------------------------------------------------");
    }

    @Override
    public void mostrarDatos() {
        System.out.println("\n--------------------" + this.getUsuario().getNombreUsuario()
                + " sus Gastos Actuales son:--------------------");
        for (int i = 0; i < totalDetalles.size(); i++) {
            System.out.println("Detalle: " + totalDetalles.get(i) + " - Gasto: $" + totalGastos.get(i));
        }
        System.out.println("------------------------------------------------------------");
    }
    
    //Método quee suma todos los gastos registrados del usuario
    public double totalSumaGastos(){
        
        double totalSumaGastos = 0;
        
        for (int i = 0; i < totalGastos.size(); i++) {
            totalSumaGastos += totalGastos.get(i);
        }
        
        return totalSumaGastos;
    }

}
