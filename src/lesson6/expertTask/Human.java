package lesson6.expertTask;

public class Human{

    private int age;
    private String name;
    private double weight;

    public Human() {
    }

    public Human(String name, int age, double weight) {
        this.name = name;
        this.age = age;
        this.weight = weight;
    }
    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getWeight() {
        return weight;
    }

    public void info() {
        System.out.println(name + " - возраст " + age + ", вес " + weight + "кг.");
    }

    public static HumanBuilder builder() {
        return new HumanBuilder();
    }

    public static class HumanBuilder {

        private Human human;
        private HumanBuilder() {
        }

        public HumanBuilder name(String name) {
            human.setName(name);
            return this;
        }
        public HumanBuilder age(int age) {
            human.setAge(age);
            return this;
        }
        public HumanBuilder weight(double weight) {
            human.setWeight(weight);
            return this;
        }
        public Human build() {
            return human;
        }
    }
}
