package AppPasoPorReferencia;

/**
 *
 * @author JuanCamiloDev
 */
public class Main {

    public static void main(String[] args) {
        //Creando el obj Carro
        Carro car = new Carro();

        car.ChangeTrademarkCar("Mazda");

        System.out.println("La marca del vehículo es: " + car.getTrademark());

        alterTrademark(car);

        System.out.println("La nueva marca del vehículo es: " + car.getTrademark());
    }

    private static void alterTrademark(Carro carP) {
        carP.ChangeTrademarkCar("Suzuki");
    }

}
