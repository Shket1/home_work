package lesson6.advansedTask.task1;

public class Rose extends Forest implements Plant, Flowering, Smell{

    public Rose(String name) {
        super(name);
    }

    @Override
    public void flowering() {
        System.out.println("роза : умеет цвести");
    }

    @Override
    public void grow() {
        System.out.println("роза растет");
    }

    @Override
    public void smell() {
        System.out.println("роза : умеет пахнуть");
    }
}
