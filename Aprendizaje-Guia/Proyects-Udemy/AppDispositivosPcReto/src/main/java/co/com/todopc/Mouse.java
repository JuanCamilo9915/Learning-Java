package co.com.todopc;

/**
 *
 * @author JuanCamiloDev
 */
public class Mouse extends DispositivosDeEntrada{
    
    //Atributos
    private int idMouse, contadorMouses;
    
    //Método contructor
    public Mouse(String tipoEntradaPS, String marcaPS) {
        super(tipoEntradaPS, marcaPS);
    }
    
    //Métodos de la clase
    @Override//Hace referencia a que se esta sobreescribiendo el método
    public String toString() {
        return "Mouse{" + "idMouse=" + idMouse + ", contadorMouses=" + contadorMouses + '}';
    }
    
}
