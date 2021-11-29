public class Main {

    public static void main(String[] args) {
        
        //Instancia del Obj Principal del Contexto
        Cuenta cuenta = new Cuenta();
        
        //Instancia de los estados de cuenta
        Usuario usuario = new Usuario();
        Ingresos ingresos = new Ingresos();
        Gastos gastos = new Gastos();
        
        //Enviando los datos del usuario
        ingresos.setUsuario(usuario);
        gastos.setUsuario(usuario);
        
        //Solicitando los datos del usuario
        cuenta.setCambioEstado(usuario);//Estado a utilizar
        cuenta.capturarDatosUsu();
        
        //Muestra el usuario registrado
        cuenta.mostrarUsuario();
        
        cuenta.menuOpciones(ingresos, gastos);
                
    }
    
}
