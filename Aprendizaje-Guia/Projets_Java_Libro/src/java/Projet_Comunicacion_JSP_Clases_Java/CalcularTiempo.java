package Projet_Comunicacion_JSP_Clases_Java;

/**
 *
 * @author JuanCamiloDev
 */
public class CalcularTiempo {
    //Atributos de la clase:
    private double tInicio, tFinal, distancia, velocidad, tTotal;

    public CalcularTiempo(String tInicio, String tFinal, String distancia) {
        this.tInicio = Double.parseDouble(tInicio);
        this.tFinal = Double.parseDouble(tFinal);
        this.distancia = Double.parseDouble(distancia);
    }

    public Double gettInicio() {
        return tInicio;
    }

    public void settInicio(Double tInicio) {
        this.tInicio = tInicio;
    }

    public Double gettFinal() {
        return tFinal;
    }

    public void settFinal(Double tFinal) {
        this.tFinal = tFinal;
    }

    public Double getDistancia() {
        return distancia;
    }

    public void setDistancia(Double distancia) {
        this.distancia = distancia;
    }

    public Double getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(Double velocidad) {
        this.velocidad = velocidad;
    }

    public Double gettTotal() {
        return tTotal;
    }

    public void settTotal(Double tTotal) {
        this.tTotal = tTotal;
    }
    
    public void velocidad(){
        velocidad = distancia/(tFinal-tInicio);
    }
    
    public void tiempoTotal(){
        tTotal = tFinal-tInicio;
    }
    
}
