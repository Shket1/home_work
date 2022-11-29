package lesson6;

/**
   //Экспертный уровень:
        //Задача №1
        // Реализовать шаблон Builder для класса Human (атрибуты - возраст, имя, вес. Метод: инфо о человеке):
        // Для этого шаблона характерно:
        // 1. приватный конструктор,
        // 2. вложенный статический класс (HumanBuilder)
        // 3. статический метод builder(), который возврашает экземпляр типа HumanBuilder.
        // Во время инициализации HumanBuilder, создается объект класса Human, и записывается в приватный атрибут.
        // 4. Класс HumanBuilder имеет методы, которые имеют тоже самое название, что и атрибуты класса Human,
        // которые вызывают сеттеры у экземпляра класса Human.
        // 5. HumanBuilder имеет метод build, который возвращает готовый объект типа Human.
        // Ожидаемый результат
        // Human human = Human.builder().name("Петр").age(20).weight(80).build();
        // human.info()
        // Петр - возраст 20, вес 80
 */

public class HomeWork {
    public static void main(String[] args) {
        Human vasiliy = new Human();
        vasiliy.info();
        Human human = Human.builder().name("Петр").age(20).weight(80).build();
        human.info();
        Human human1 = Human.builder().name("Николай").age(31).weight(83).build();
        human1.info();
        human.info();
        Human jon = new Human("Jon", 28, 76);
        jon.info();
        Human human2 = Human.builder().build();
        human2.info();
    }
}
