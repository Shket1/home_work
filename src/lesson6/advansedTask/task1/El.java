package lesson6.advansedTask.task1;

public class El extends Forest implements Wood, Smell, Bumps {

    public El(String name) {
        super(name);
    }

    @Override
    public void grow() {
        System.out.println("ель растет");
    }

    @Override
    public void smell() {
        System.out.println("ель : умеет пахнуть");
    }

    @Override
    public void bumps() {
        System.out.println("ель : имеет шишки");
    }
}
