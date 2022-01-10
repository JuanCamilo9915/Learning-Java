package ClasesMultiples;

/**
 *
 * @author JuanCamiloDev
 */
public class ClasesMultiples {

    public static void main(String[] args) {

        int result;
        Suma sum = instanciarObjSuma();
        
        result = sum.a + sum.b;
        
        System.out.println("La suma es: " + result);
        
    }

    //Método de la clase ClasesMultiples es de tipo de la clase Suma
    private static Suma instanciarObjSuma() {

        Suma sum = new Suma(4,7);
        
        return sum;
        
    }

}

//Creando la clase suma
class Suma {
    
    int a, b;
    
    //Constructor de la clase Suma
    Suma(int a, int b){
        this.a = a;
        this.b = b;
    }

}
