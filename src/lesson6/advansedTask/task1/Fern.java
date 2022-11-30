package lesson6.advansedTask.task1;

public class Fern extends Forest implements Plant, Flowering{

    public Fern(String name) {
        super(name);
    }

    @Override
    public void flowering() {
        System.out.println("папоротник : умеет цвести");
    }

    @Override
    public void grow() {
        System.out.println("папоротник растет");
    }
}
