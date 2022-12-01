package lesson6.advansedTask.task2;

/**
 *  Задание №2:
 *          Написать систему управления складскими запасами. Создать класс склад, создать класс работники
 *          (написать геттеры на все аттрибуты).
 *          Количество работников минимум 3.
 *          Работники берут из склада товар, и портят его. Нужно написать взаимодействие через методы работников и склад:
 *          Работник берет из склада товар, на складе товар уменьшается. Работник когда взял товар, выводит на экран
 *          "Ура я испортил водку!" и добавляет к себе в журнал количество испорченного товара.
 *          У склада есть только одна позиция - Водка.
 */

public class Main {
    public static void main(String[] args) {
        Stock stock = new Stock(100);

        Workers vadim = new Workers("Vadim", 39);
        Workers vasya = new Workers("Vasya", 34);
        Workers petya = new Workers("Petya", 49);

        vadim.getVodka(stock);
        vadim.getListOfDamageGoods();

        vasya.getListOfDamageGoods();

        petya.getVodka(stock);
        petya.getVodka(stock);
        petya.getVodka(stock);
        petya.getListOfDamageGoods();

        System.out.println(stock.getAmountOfVodka());
    }
}
