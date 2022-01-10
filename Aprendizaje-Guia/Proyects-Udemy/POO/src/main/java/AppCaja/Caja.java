package AppCaja;

/**
 *
 * @author JuanCamiloDev
 */
public class Caja {
    
    public static void main(String[] args) {
        //Creando Obj
        CalculoVolumenCaja volumenCaja = new CalculoVolumenCaja(3,2,6);
        
        System.out.println("El Volumen de la Caja es: " + volumenCaja.calcularVolumCubo());
    }
    
}
