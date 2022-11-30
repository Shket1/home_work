package lesson6.advansedTask.task1;

public class Sosna extends Forest implements Wood, Smell, Bumps {

    public Sosna(String name) {
        super(name);
    }

    @Override
    public void grow() {
        System.out.println("сосна растет");
    }

    @Override
    public void smell() {
        System.out.println("сосна : умеет пахнуть");
    }

    @Override
    public void bumps() {
        System.out.println("сосна : имеет шишки");
    }
}
