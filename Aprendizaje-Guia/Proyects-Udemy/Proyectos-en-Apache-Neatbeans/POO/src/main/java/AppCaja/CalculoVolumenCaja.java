package AppCaja;

/**
 *
 * @author JuanCamiloDev
 */
public class CalculoVolumenCaja {
    
    //Atributos de la clase
    int ancho, alto, profundidad;
    
    //Constructores Vacios y con parametros de la clase
    public CalculoVolumenCaja(){
        System.out.println("Constructor Vacio");
    }
    
    public CalculoVolumenCaja(int anchoP, int altoP, int profundidadP){
        System.out.println("Constructor Con Parámetros");
        this.ancho = anchoP;
        this.alto = altoP;
        this.profundidad = profundidadP;
    }
    
    public int calcularVolumCubo(){
        return (this.ancho * this.alto * this.profundidad);
    }
    
}
