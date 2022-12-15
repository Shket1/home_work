package lesson8.expertTask;

public class Runner {
    public static void main(String[] args) {
        Car bmw = new Car("BMW", 10000d);
        Car mercedes = new Car("Mercedes", -2);

        CarShop carShop = new CarShop(bmw);
        CarShop carShop1 = new CarShop(mercedes);

        carShop.sellCar();

        System.out.println("------------------------------------");

        carShop1.sellCar();
    }
}
