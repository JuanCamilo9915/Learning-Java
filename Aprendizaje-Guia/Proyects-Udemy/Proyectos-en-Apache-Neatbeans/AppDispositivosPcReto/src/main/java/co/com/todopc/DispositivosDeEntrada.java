package co.com.todopc;//Todos los paquetes tienen esta convención en java

/**
 *
 * @author JuanCamiloDev
 */
public class DispositivosDeEntrada {
    
    //Atributos
    private String tipoEntrada, marca;
    
    //Constructor
    public DispositivosDeEntrada(String tipoEntradaP, String marcaP) {
        this.tipoEntrada = tipoEntradaP;
        this.marca = marcaP;
    }
    
    //Métodos Get y Set

    public String getTipoEntrada() {
        return tipoEntrada;
    }

    public void setTipoEntrada(String tipoEntrada) {
        this.tipoEntrada = tipoEntrada;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }
    
    //Métodos de la clase
    @Override
    public String toString() {
        return "DispositivosDeEntrada{" + "tipoEntrada=" + tipoEntrada + ", marca=" + marca + '}';
    }
    
    
}
