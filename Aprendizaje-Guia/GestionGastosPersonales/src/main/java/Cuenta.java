import java.util.Scanner;

public class Cuenta {

    //Atributo de tipo menú
    private MenuOpciones menuOpciones;

    //Atributo de tipo Estado
    private Estado estado;

    //Método que controla el estado de la cuenta    
    public void setCambioEstado(Estado estado) {
        this.estado = estado;
    }

    //Se agregan datos
    public void capturarDatosUsu() {
        estado.agregarDatos();
    }

    //Muestra el menú de opciones
    public void menuOpciones(Ingresos estadoIngresos, Gastos estadoGastos) {

        int opcionUsuario = 0;

        //Ciclo del programa
        do {
            menuOpciones = new MenuOpciones();
            opcionUsuario = menuOpciones.capturaOpcionMenu();

            switch (opcionUsuario) {
                case 1://Agrega los ingresos a la cuenta
                    if (estado != estadoIngresos) {
                        this.setCambioEstado(estadoIngresos);
                    }
                    //Captura el detalle y valor de los ingresos
                    this.capturaDatosCuenta(estadoIngresos, estadoGastos, "ingreso");
                    estado.agregarDatos();//Registran los ingresos capturados del usuario
                    break;
                case 2://Agrega los gastos a la cuenta
                    if (estado != estadoGastos) {
                        this.setCambioEstado(estadoGastos);
                    }
                    //Captura el detalle y valor de los gastos
                    this.capturaDatosCuenta(estadoIngresos, estadoGastos, "gasto");
                    estado.agregarDatos();//Registran los gastos capturados del usuario
                    break;
                case 3://Muestra los ingresos del usuario
                    if (estado != estadoIngresos) {
                        this.setCambioEstado(estadoIngresos);
                    }
                    estado.mostrarDatos();
                    break;
                case 4://Muestra los gastos del usuario
                    if (estado != estadoGastos) {
                        this.setCambioEstado(estadoGastos);
                    }
                    estado.mostrarDatos();
                    break;
                case 5://Muestra el total neto(libre de gastos) de la cuenta 
                    if (estado != estadoIngresos) {
                        this.setCambioEstado(estadoIngresos);
                        estadoIngresos.setGastos(estadoGastos);//Asegura los datos del estado Gastos
                    }
                    estadoIngresos.totalDineroCuenta();//Se muestra un resumen de la cuenta
                    break;
                default:
                    System.out.println("Cerrando sesión.");
                    System.out.println("Muchas gracias por utilizar nuestro sistema.");
                    System.exit(0);//Termina con el proceso(cierra el programa)
            }

        } while (opcionUsuario != 0);

    }

    //Muestra el usuario
    public void mostrarUsuario() {
        estado.mostrarDatos();
    }

    //Capturan los datos de los estado Ingresos o Gastos
    private void capturaDatosCuenta(Ingresos estadoIngresos, Gastos estadoGastos, String detalle) {
        //Captura de datos por teclado(consola)
        Scanner lectura = new Scanner(System.in);

        System.out.println("\n--------------------Capturando datos del Estado " + detalle + "--------------------");
        System.out.println("Digite el detalle del " + detalle);
        if (detalle == "ingreso") {
            estadoIngresos.setDetalle(lectura.nextLine());
        } else {
            estadoGastos.setDetalle(lectura.nextLine());
        }
        System.out.println("------------------------------------");
        System.out.println("Digite el valor del " + detalle);
        if (detalle == "ingreso") {
            estadoIngresos.setIngreso(Double.parseDouble(lectura.nextLine()));
        } else {
            estadoGastos.setGasto(Double.parseDouble(lectura.nextLine()));
        }

    }

}
