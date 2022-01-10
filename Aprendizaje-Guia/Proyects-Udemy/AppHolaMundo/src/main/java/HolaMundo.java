
import java.util.Scanner;

/**
 * @author JuanCamiloDev
 */
public class HolaMundo {

    public static void main(String[] args) {
        //Atributos de la clase:
        String cadena = "Hola Mundo en Java!, utilizando una variable de tipo cadena";
        //var despedida = "Hasta pronto amigo"; --> Esta opción solo esta disponible para las versiones del jdk 10 en adelante

        System.out.println(cadena);
        System.out.println(cadena);
        System.out.println(cadena);

        //-------------------------------------------------------------------------------------------------------------------------
        System.out.println("\n-----------------------------------New Program-----------------------------------\n");
        //-------------------------------------------------------------------------------------------------------------------------
        String namePerson = "Juan Camilo";
        String greeting = "Hola, ¿Como estás?";

        System.out.println(greeting + " " + namePerson);

        //-------------------------------------------------------------------------------------------------------------------------
        System.out.println("\n-----------------------------------New Program-----------------------------------\n");
        //-------------------------------------------------------------------------------------------------------------------------
        int num1 = 7, num2 = 10;

        System.out.println("La suma es: " + num1 + num2);
        System.out.println("La suma 2 es: " + (num1 + num2));
        System.out.println(num1 + num2 + "La suma es: ");

        //-------------------------------------------------------------------------------------------------------------------------
        System.out.println("\n-----------------------------------New Program-----------------------------------\n");
        //-------------------------------------------------------------------------------------------------------------------------
        String name = "Juan Camilo", lastName = "González Duque";

        System.out.println("Estudent: \t" + "\'" + name + "\" \b'" + lastName);

        //-------------------------------------------------------------------------------------------------------------------------
        System.out.println("\n-----------------------------------New Program-----------------------------------\n");
        //-------------------------------------------------------------------------------------------------------------------------
        Scanner input = new Scanner(System.in);
        Scanner input2 = new Scanner(System.in);

        System.out.println("Ingrese un dato (Funcionaliad comentada, por el momento)");
        /*String inputUser = input.next();
        String inputUser2 = input2.nextLine();
        
        System.out.println("El usuario ingreso el siguiente dato: "+ inputUser + " y " + inputUser2);*/

        //-------------------------------------------------------------------------------------------------------------------------
        System.out.println("\n-----------------------------------New Program-----------------------------------\n");
        //-------------------------------------------------------------------------------------------------------------------------

        System.out.println("-----------------------------Tipo Byte-----------------------------");
        byte tipoByte = 127;//Rango de valores de -128 a 127

        System.out.println("Tipo Byte: " + tipoByte);
        System.out.println("Rango de bits que puede almacenar los tipos de datos Byte son: '" + Byte.SIZE + "' bits máximo");
        System.out.println("Cantidad de bytes que almacena el tipo de dato byte son: '" + Byte.BYTES + "' bytes máximos");
        System.out.println("Cantidad numérica mínima de bytes que almacena el tipo de dato byte son: '" + Byte.MIN_VALUE + "'");
        System.out.println("Cantidad numérica máxima de bytes que almacena el tipo de dato byte son: '" + Byte.MAX_VALUE + "'");

        System.out.println("\n-----------------------------Tipo Short-----------------------------");
        short tipoShort = 1027;//Rango de valores de -32768 a 32767

        System.out.println("Tipo short: " + tipoShort);
        System.out.println("Rango de bits que puede almacenar los tipos de datos short son: '" + Short.SIZE + "' bits máximo");
        System.out.println("Cantidad de bytes que almacena el tipo de dato short son: '" + Short.BYTES + "' bytes máximos");
        System.out.println("Cantidad numérica mínima de bytes que almacena el tipo de dato short son: '" + Short.MIN_VALUE + "'");
        System.out.println("Cantidad numérica máxima de bytes que almacena el tipo de dato short son: '" + Short.MAX_VALUE + "'");

        System.out.println("\n-----------------------------Tipo Int-----------------------------");
        int tipoInt = 10027;//Rango de valores de -2147483648 a 2147483647

        System.out.println("Tipo int: " + tipoInt);
        System.out.println("Rango de bits que puede almacenar los tipos de datos Int son: '" + Integer.SIZE + "' bits máximo");
        System.out.println("Cantidad de bytes que almacena el tipo de dato int son: '" + Integer.BYTES + "' bytes máximos");
        System.out.println("Cantidad numérica mínima de bytes que almacena el tipo de dato int son: '" + Integer.MIN_VALUE + "'");
        System.out.println("Cantidad numérica máxima de bytes que almacena el tipo de dato int son: '" + Integer.MAX_VALUE + "'");

        System.out.println("\n-----------------------------Tipo Long-----------------------------");
        long tipoLong = 9223372036854775807L;//Rango de valores de -9223372036854775808 a 9223372036854775807, la 'L' al final hace referencia al literal del valor

        System.out.println("Tipo long: " + tipoLong);
        System.out.println("Rango de bits que puede almacenar los tipos de datos long son: '" + Long.SIZE + "' bits máximo");
        System.out.println("Cantidad de bytes que almacena el tipo de dato long son: '" + Long.BYTES + "' bytes máximos");
        System.out.println("Cantidad numérica mínima de bytes que almacena el tipo de dato long son: '" + Long.MIN_VALUE + "'");
        System.out.println("Cantidad numérica máxima de bytes que almacena el tipo de dato long son: '" + Long.MAX_VALUE + "'");

        System.out.println("\n-----------------------------Tipo Float-----------------------------");
        float tipoFloat = 1000.10F;//Rango de valores de -1.4E-45 a 3.4028235E38, la 'F' al final hace referencia al literal del valor

        System.out.println("Tipo Float: " + tipoFloat);
        System.out.println("Rango de bits que puede almacenar los tipos de datos float son: '" + Float.SIZE + "' bits máximo");
        System.out.println("Cantidad de bytes que almacena el tipo de dato float son: '" + Float.BYTES + "' bytes máximos");
        System.out.println("Cantidad numérica mínima de bytes que almacena el tipo de dato float son: '" + Float.MIN_VALUE + "'");
        System.out.println("Cantidad numérica máxima de bytes que almacena el tipo de dato float son: '" + Float.MAX_VALUE + "'");

        System.out.println("\n-----------------------------Tipo Double-----------------------------");
        double tipoDouble = 1000D;//Rango de valores de 4.9E-324 a 1.7976931348623157E308, la 'D' al final hace referencia al literal del valor

        System.out.println("Tipo Double: " + tipoDouble);
        System.out.println("Rango de bits que puede almacenar los tipos de datos double son: '" + Double.SIZE + "' bits máximo");
        System.out.println("Cantidad de bytes que almacena el tipo de dato double son: '" + Double.BYTES + "' bytes máximos");
        System.out.println("Cantidad numérica mínima de bytes que almacena el tipo de dato double son: '" + Double.MIN_VALUE + "'");
        System.out.println("Cantidad numérica máxima de bytes que almacena el tipo de dato double son: '" + Double.MAX_VALUE + "'");

        System.out.println("\n-----------------------------Tipo Char-----------------------------");
        char tipoChar = '!';//Para los datos tipo char de sebe utilizar una comilla simple
        //char tipoCharUniCode = '\u0021'; --> La '\ u' hace referencia al caracter unicode
        char tipoCharDecimal = 33;//Estos tipos de datos por defecto entienden los valores en decimal

        System.out.println("Tipo Char: " + tipoChar);
        //System.out.println("Tipo Char utilizando el valor UniCode: " + tipoCharUniCode);
        System.out.println("Tipo Char utilizando el valor Decimal: " + tipoCharDecimal);
        System.out.println("Rango de bits que puede almacenar los tipos de datos char son: '" + Character.SIZE + "' bits máximo");
        System.out.println("Cantidad de bytes que almacena el tipo de dato char son: '" + Character.BYTES + "' bytes máximos");
        System.out.println("Cantidad numérica mínima de bytes que almacena el tipo de dato char son: '" + Character.MIN_VALUE + "'");
        System.out.println("Cantidad numérica máxima de bytes que almacena el tipo de dato char son: '" + Character.MAX_VALUE + "'");

        //-------------------------------------------------------------------------------------------------------------------------
        System.out.println("\n-----------------------------------New Program-----------------------------------\n");
        //-------------------------------------------------------------------------------------------------------------------------

        System.out.println("-----------------------------Bases Numéricas-----------------------------");
        int numDecimal = 10, numOctal = 012, numHexadecimal = 0xA, numBinario = 0b1010;

        System.out.println("numero en Base Decimal: " + numDecimal);
        System.out.println("numero en Base Octal: " + numOctal + " Representado en base Decimal");
        System.out.println("numero en Base Hexadecimal: " + numHexadecimal + " Representado en base Decimal");
        System.out.println("numero en Base Binaria: " + numBinario + " Representado en base Decimal");

        //-------------------------------------------------------------------------------------------------------------------------
        System.out.println("\n-----------------------------------New Program-----------------------------------\n");
        //-------------------------------------------------------------------------------------------------------------------------

        System.out.println("-----------------------------Conversión de Tipos de Datos-----------------------------");
        int cadenaAEntero = Integer.parseInt("17");
        double cadenaADouble = Double.parseDouble("3.1416");
        char cadenaACaracter = "Hola".charAt(1);
        String enteroACadena, booleanACadena;
        short s = 10;
        byte b;

        b = (byte) s;//Con el type casting hay que tener encuenta el rango entre los tipos de datos, para no tener perdidas de info

        System.out.println("Edad: " + cadenaAEntero);
        System.out.println("Decimal: " + cadenaADouble);
        System.out.println("Caracter: " + cadenaACaracter);
        System.out.println("Type Casting entre un dato de tipo (short) a un (byte): " + b);

        System.out.println("-----------------------------Conversión de Datos con Scanner-----------------------------");
        /*Scanner inputUser = new Scanner(System.in);
        Scanner inputUser2 = new Scanner(System.in);*/

 /*System.out.println("Ingrese su edad porfavor:");
        int inputEdad = Integer.parseInt(inputUser.nextLine());
        int inputEdad = inputUser.nextInt(); --> Con el método 'nextInt' de Scanner, podemos obtener un entero sin realizar conversión
        System.out.println("Ingrese su nombre porfavor:");
        char inputCaracter = inputUser.nextLine().charAt(0);
        
        System.out.println("inputEdad: " + inputEdad);
        System.out.println("inputCaracter: " + inputCaracter);*/
        enteroACadena = String.valueOf(22);
        booleanACadena = String.valueOf(true);

        System.out.println("Edad como una cadena: " + enteroACadena);
        System.out.println("Boolean (true) como una cadena: " + booleanACadena);

        //-------------------------------------------------------------------------------------------------------------------------
        System.out.println("\n-----------------------------------New Program-----------------------------------\n");
        //-------------------------------------------------------------------------------------------------------------------------

        System.out.println("-----------------------------Operadores Aritméticos-----------------------------");
        int numUno = 3, numDos = 2, result;
        double result2;

        result = numUno + numDos;
        System.out.println("La suma es: " + result);

        result = numUno - numDos;
        System.out.println("La resta es: " + result);

        result = numUno * numDos;
        System.out.println("La multiplicación es: " + result);

        result2 = (double) numUno / numDos;
        System.out.println("La divición es: " + result2);

        result = numUno % numDos;
        System.out.println("El residuo de la divición es: " + result);

        result = numUno % 2;// este es el operador de modulo
        System.out.println("El residuo de la divición 2 es: " + result);

        if (result == 0) {
            System.out.println("El numero ingresado es PAR");
        } else {
            System.out.println("El numero ingresado es IMPAR");
        }

        System.out.println("-----------------------------Operador Ternario-----------------------------");
        //Tipo de Dato resultado = (Expresión a evaluar) ? Sección de true : Sección de false
        boolean resultOpeTernario = (3 < 7) ? true : false;
        String resultOpeTernario2 = (3 < 7) ? "Verdadero" : "Falso";
        int resultOpeTernario3 = (3 < 7) ? 1 : 0;
        //int resultOpeTernario4 = (3 < 7) ? 1 : "Falso"; --> esto solo aplica para las versiones del jdk 10 +, que admiten "var"

        int numAEvaluar = 7;
        String numEsPar = (numAEvaluar % 2 == 0) ? "Es Par" : "Es Impar";

        System.out.println("Resultado de la expresión evaluada con el operador ternario es: '" + resultOpeTernario + "' Tipo Booleano");
        System.out.println("Resultado de la expresión evaluada con el operador ternario es: '" + resultOpeTernario2 + "' Tipo Cadena");
        System.out.println("Resultado de la expresión evaluada con el operador ternario es: '" + resultOpeTernario3 + "' Tipo Entero");

        System.out.println("\nResultado de la expresión evaluada con el operador ternario es: '" + numEsPar + "' Tipo Cadena");

        //-------------------------------------------------------------------------------------------------------------------------
        System.out.println("\n-----------------------------------New Program-----------------------------------\n");
        //-------------------------------------------------------------------------------------------------------------------------
        System.out.println("-----------------------------Orden o Precedencia de Operadores-----------------------------");
        int resultPrecedenciaOpe = 4 + 3 * 8 / 10;//Esto es equivalente a 4+((3*8)/10)
        double resultPrecedenciaOpe2 = 4 + 3 * ((double) (8 / 10));//Esto es equivalente a 4+((3*8)/10)

        System.out.println("El resultado es: " + resultPrecedenciaOpe);
        System.out.println("El resultado como double es: " + (double) resultPrecedenciaOpe);
        System.out.println("El resultado utilizando parentesis como double es: " + resultPrecedenciaOpe2);

        //-------------------------------------------------------------------------------------------------------------------------
        System.out.println("\n-----------------------------------New Program-----------------------------------\n");
        //-------------------------------------------------------------------------------------------------------------------------
        System.out.println("-----------------------------Sentencias de Control-----------------------------");

        System.out.println("\n---------------------Sentencia IF-Else---------------------");
        boolean condicion = false;
        String condicion2 = "dssfd";

        //No ta Importante: Se quitan las llaves únicamente cuando solo es una linea de código
        if (condicion) {
            System.out.println("Verdadero");
        } else {
            System.out.println("Falso");
        }

        //if-else if-else
        if (condicion2 == "") {
            System.out.println("1-Condición: " + condicion2);
        } else if (condicion) {
            System.out.println("2-Condición: " + condicion);
        } else {
            System.out.println("3-Condición: " + condicion);
        }

        System.out.println("\n---------------------Sentencia Switch---------------------");
        int numero = 1;
        String numeroACadena = null;

        switch (numero) {
            case 1:
            case 4://De esta manera anidamos los casos a evaluar que den un mismo resultado
                numeroACadena = "Numero 1 y/o 4";
                break;
            case 2:
                numeroACadena = "Numero 2";
                break;
            case 3:
                numeroACadena = "Numero 3";
                break;
            default:
                numeroACadena = "Numero Desconocido";
        }

        System.out.println("numeroACadena: " + numeroACadena);

        System.out.println("\n---------------------Ciclo While---------------------");
        int datoNum = 3;

        while (datoNum <= 10) {
            System.out.println("Ciclo While: " + datoNum);
            datoNum++;
        }

        System.out.println("\n---------------------Ciclo Do While---------------------");
        do {
            System.out.println("Ciclo Do While: " + datoNum);
            datoNum++;
        } while (datoNum <= 10);

        System.out.println("\n---------------------Ciclo For---------------------");
        for (int i = 0; i <= 10; i++) {//for (int i = 10; i > 0; i++) con esta condición se genera un for infinito
            System.out.println("Ciclo For: " + i);
        }
        
        nuevaIteración://Esto hace referencia a un label(Etiqueta en Java)
        for (int i = 0; i <= datoNum; i++) {//for (int i = 10; i > 0; i++) con esta condición se genera un for infinito
            if (i % 2 != 0) {
                continue nuevaIteración;//y de esta manera se indica en que parte del código se quiere continuar
            }
            System.out.println("\nNumeros Pares: " + i);
        }
    }
}
