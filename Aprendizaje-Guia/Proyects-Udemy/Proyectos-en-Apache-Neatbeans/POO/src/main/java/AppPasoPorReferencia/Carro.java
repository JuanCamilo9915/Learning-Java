package AppPasoPorReferencia;

/**
 *
 * @author JuanCamiloDev
 */
public class Carro {
    
    String trademarkCar;//marca del Automóvil
    
    public String getTrademark(){
        return this.trademarkCar;
    }
    
    public void ChangeTrademarkCar(String newTrademark){
        this.trademarkCar = newTrademark;
    }
    
}
