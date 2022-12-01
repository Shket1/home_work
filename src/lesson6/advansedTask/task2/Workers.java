package lesson6.advansedTask.task2;

public class Workers {

    private String name;
    private int age;
    private int listOfDamageGoods;

    public Workers(String name, int age) {
        this.name = name;
        this.age = age;
        listOfDamageGoods = 0;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void getListOfDamageGoods() {
        System.out.println("Я всего испортил " + listOfDamageGoods + " водки.");
    }

    public void getVodka(Stock obj) {
        int res = obj.getVodka();
        if (res == 0) {
            System.out.println("На складе пусто.");
        } else {
            this.listOfDamageGoods++;
            System.out.println("Ура я испортил водку!");
        }
    }
}
