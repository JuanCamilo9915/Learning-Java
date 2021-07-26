package AppPasoPorValor;

/**
 *
 * @author JuanCamiloDev
 */
public class main {
    
    public static void main(String[] args) {
        
        int x = 10;
        
        System.out.println("El valor de la X es: " + x);
        
        //Cambiando el valor de la variable X --> variable en inglés es changeable
        changeValueChangeable(x);//Métado estático
        
        System.out.println("El valor de la X es: " + x);
        
    }
    //Los métodos que esten creados junto al método de main tienen que ser estaticos(static)
    public static void changeValueChangeable(int arg){
        arg = 20;
        System.out.println("El valor de arg es: " + arg);
    }
    
}
