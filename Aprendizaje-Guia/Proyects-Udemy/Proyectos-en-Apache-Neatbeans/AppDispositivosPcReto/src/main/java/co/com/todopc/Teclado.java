package co.com.todopc;

/**
 *
 * @author JuanCamiloDev
 */
public class Teclado extends DispositivosDeEntrada{
    
    //Atributos
    private int idTeclado, contadorTeclados;
    
    //Método contructor
    public Teclado(String tipoEntradaPS, String marcaPS) {
        super(tipoEntradaPS, marcaPS);
    }
    
    //Métodos de la clase
    @Override//Hace referencia a que se esta sobreescribiendo el método
    public String toString() {
        return "Mouse{" + "idMouse=" + idTeclado + ", contadorMouses=" + contadorTeclados + '}';
    }
    
}
