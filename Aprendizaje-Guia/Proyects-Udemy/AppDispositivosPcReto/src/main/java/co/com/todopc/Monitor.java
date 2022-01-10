package co.com.todopc;

/**
 *
 * @author JuanCamiloDev
 */
public class Monitor {

    //Atributos
    private int idMonitor;
    private String marca;
    private double dimensionesPantalla;
    private int contadorMonitores;

    private Monitor() {

    }
    
    public Monitor(String marcaP, double dimensionesPantallaP) {
        this.marca = marcaP;
        this.dimensionesPantalla = dimensionesPantallaP;
    }
    
    //Métodos Get y Set
    public int getIdMonitor() {
        return idMonitor;
    }

    public void setIdMonitor(int idMonitor) {
        this.idMonitor = idMonitor;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public double getDimensionesPantalla() {
        return dimensionesPantalla;
    }

    public void setDimensionesPantalla(double dimensionesPantalla) {
        this.dimensionesPantalla = dimensionesPantalla;
    }

    public int getContadorMonitores() {
        return contadorMonitores;
    }

    public void setContadorMonitores(int contadorMonitores) {
        this.contadorMonitores = contadorMonitores;
    }
    

    //Métodos de la Clase
    @Override
    public String toString() {
        return "Monitor{" + "idMonitor=" + idMonitor + ", marca=" + marca + ", dimensionesPantalla=" + dimensionesPantalla + ", contadorMonitores=" + contadorMonitores + '}';
    }

    
}
