package co.com.todopc;

/**
 *
 * @author JuanCamiloDev
 */
public class Pc {
    
    //Atributos
    private int idPc;
    private String nombre;
    
    //Atributos de Tipo Obj
    private Monitor monitor;
    private Teclado teclado;
    private Mouse mouse;
    
    //Constructor
    private Pc(){
        
    }
    
    public Pc(String nombreMonitor, Monitor monitorP, Teclado tecladoP, Mouse mouseP){
        this.nombre = nombreMonitor;
        this.monitor = monitorP;
        this.teclado = tecladoP;
        this.mouse = mouseP;
    }
    
    //Métodos Get y Set

    public int getIdPc() {
        return idPc;
    }

    public void setIdPc(int idPc) {
        this.idPc = idPc;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Monitor getMonitor() {
        return monitor;
    }

    public void setMonitor(Monitor monitor) {
        this.monitor = monitor;
    }

    public Teclado getTeclado() {
        return teclado;
    }

    public void setTeclado(Teclado teclado) {
        this.teclado = teclado;
    }

    public Mouse getMouse() {
        return mouse;
    }

    public void setMouse(Mouse mouse) {
        this.mouse = mouse;
    }
    
    //Métodos de la clase
    @Override
    public String toString() {
        return "Pc{" + "idPc=" + idPc + ", nombre=" + nombre + ", monitor=" + monitor + ", teclado=" + teclado + ", mouse=" + mouse + '}';
    }
    
    
    
    
}
