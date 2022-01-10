package AppPersonas;

/**
  * @author JuanCamiloDev
 */
public class Persona {
    //Atributas de la clase Persona
    String name, lastName, uni, programaUni;
    
    //Constructor del obj Persona
    //Constructor Vacio
    public Persona(){
        System.out.println("Ejecutando el constructor vacio de la clase Persona");
    }
    
    //Constructor Con Argumentos
    public Persona(String name, String lastName, String uni, String programaUni){
        //this --> hace referencia a los atributos del objeto en cuestión, en este caso del obj Persona
        System.out.println("Ejecutando el constructor con argumentos(parametros) de la clase Persona\n");
        this.name = name;
        this.lastName = lastName;
        this.uni = uni;
        this.programaUni = programaUni;
    }
    
    //Métodos de la clase Persona
    public void displayName(){
        System.out.println("Name: " + this.name + " Last Name: " + this.lastName);
    }
    
    public String datosAcademicos(String uniP, String programaUniP){
        //Atributo del método
        String datosAcademicos;
        
        /*this --> hace referencia a los atributos del objeto en cuestión, en este caso del obj Persona
        
        this.uni = uni;
        this.programaUni = programaUni;*/
        
        this.uni = uniP;
        this.programaUni = programaUniP;
        
        return datosAcademicos = this.uni + " - " + this.programaUni;//funciona sin el this, pero se utiliza por buena practiva
        
        //return datosAcademicos;
    }
    
    public String datosAcademicos2(){ 
        
        return this.uni + " - " + this.programaUni;//Retorno Directo
        
        //Atributo del método
        //String datosAcademicos;
        
        //datosAcademicos = uni + " - " + programaUni;
        
        //return datosAcademicos;
    }
}
