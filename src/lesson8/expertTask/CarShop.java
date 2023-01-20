package lesson8.expertTask;

/*
// Для этого шаблона характерно:
// 1. Класс основа (Car), и класс декоратор (CarShop), который принимает в себя экземпляр класса основы
// 2. Вызов всех методов происходит у декоратора
// Необходимо вызвать у декоратора метод продать машину, который выведет на экран для машины со стоимостью 5000
// Здравствуй клиент, цена этого авто (Вызвано из объекта CarShop):
// 5000 - (вызванно из объекта Car)
// Хочешь купить авто? (Вызвано из объекта CarShop)

// Если стоимость машины меньше нуля:
// Здравствуй клиент, цена этого авто (Вызвано из объекта CarShop):
// Неизвестна мне - (выдано из объекта CarShop)
// Давайте посмотрим другое авто? (Вызвано из объекта CarShop)

 */
public class CarShop {
    Car car;

    public CarShop(Car car) {
        this.car = car;
    }
    public void sellCar() {
        System.out.println("Здравствуй клиент, цена этого авто: ");
        try {
            if (car.getPrice() > 0) {
                System.out.println(car.getPrice());
                System.out.println("Хочешь купить авто?");
            } else {
                throw new Exception("Неизвестна мне");
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
            System.out.println("Давайте посмотрим другое авто?");
        }

    }
}
