package lesson6.advansedTask.task1;

/**
 * //Продвинутый уровень
 *         //Задача №1
 *         //1. Создать следующую структуру из классов и интерфейсов:
 *         // дерево -> ель (имеет шишки, умеет пахнуть)
 *         // дерево -> сосна (имеет шишки, умеет пахнуть)
 *         // растение -> роза (умеет цвести, умеет пахнуть)
 *         // растение -> папоротник (умеет цвести)
 *         // Создать у каждого класса по объекту, распределить по массивам интерфейсов
 *         // И у каждого массива вызвать характерный метод
 *         //Ожидание:
 *         // сосна : умеет пахнуть
 *         // ель : умееть пахнуть
 *         // роза: умееть пахнуть
 *         // роза: умеет цвести
 *         // папоротник: умеет цвести
 */

public class HomeWork {
    public static void main(String[] args) {
        Forest sosna = new Sosna("Сосна");
        Forest el = new El("Ель");
        Forest rose = new Rose("Роза");
        Forest fern = new Fern("Папоротник");

        Forest[] forest = {sosna, el, rose, fern};

        for (Forest obg : forest) {
            if (obg instanceof Smell) {
                ((Smell) obg).smell();
            }
            if (obg instanceof Flowering) {
                ((Flowering) obg).flowering();
            }
        }
    }
}
