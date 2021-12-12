package Modelo;
/**
 *
 * @author JuanCamiloDev
 */
public class Usu {
    //Atributos:
    private boolean estadoSql, contador;
    private String nom, ape, email, pass;
    private int tel;
    
    //Metodos Get:
    public String getNom() {
        return nom;
    }

    public String getApe() {
        return ape;
    }

    public String getEmail() {
        return email;
    }

    public String getPass() {
        return pass;
    }

    public int getTel() {
        return tel;
    }

    public boolean isEstadoSql() {
        return estadoSql;
    }

    public boolean getContador() {
        return contador;
    }

    //Metodos Set:
    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setApe(String ape) {
        this.ape = ape;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public void setTel(int tel) {
        this.tel = tel;
    }

    public void setEstadoSql(boolean estadoSql) {
        this.estadoSql = estadoSql;
    }

    public void setContador(boolean contador) {
        System.out.println("contador Usu: "+contador);
        this.contador = contador;
    }
    
}
