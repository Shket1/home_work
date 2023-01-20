package lesson8.advansedTask;

//Продвинутая
//Задача №1
//2. Создать следующую структуру из классов и интерфейсов
// магазин (обладает работниками)
// работник (обладает часами - (часы одни))
// часы (умеют тикать, если сломаны выкидывают ошибку WatchBrokenError)
// Бренд (обладает массивом магазинов)
// Создать бренд, положить в него два магазина, в каждом магазине будет по работнику,
// у каждого работника по часам. У одного работника часы сломаны, у второго нет.
// После создания бренда, вытащить из него все часы и вызвать у всех часов метод тикать,
// обработать ошибку сломанных часов.
// Ожидание вывода на экран:
// Часы тикают
// Ошибка: Часы сломались.

public class Runner {
    public static void main(String[] args) {
        Employment igor = new Employment("Игорь");
        Employment gena = new Employment("Гена");

        Shop shop1 = new Shop();
        shop1.addEmployments(new Employment[]{igor});

        Shop shop2 = new Shop();
        shop1.addEmployments(new Employment[]{gena});

        Brand lW = new Brand("LW");
        lW.addNewShops(new Shop[]{shop1, shop2});

        try {
            lW.getShop(0).getEmployment(0).tick(true);
            lW.getShop(1).getEmployment(0).tick(false);
        } catch (WatchBrokenError e) {
            System.out.println(e.getMessage());
        }
    }
}
