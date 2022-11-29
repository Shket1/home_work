package lesson4;

// Экспертный уровень:
// Предыстория: Мы находимся в статистическом институте. Хочется понять уровень миграции между регионами за месяц.
// Для этого было решено произвести анализ передвижения автомобилей: на границе каждого региона стоят камеры,
// фиксирующие въезд и выезд автомобилей. Формат автомобильного номера: (буква)(3 цифры)(2 буквы)(2-3 цифры)
// К474СЕ178 - где 178 регион

// Задача №1: узнать сколько всего машин со спец номерами(вывести на экран): начинаются на M
// и заканчиваются на АВ (русские буквы).
// Не повторяющиеся
//Для генерации данных воспользоваться GeneratorExpertHomework.getData()

//Входящие данные
// Map<Integer, Map<String, String[]>> - где ключ первого уровня - номер региона,
// out, input - ключи второго уровня (выезд, въезд), и String[] - массивы номеров.
// { 1 : {
//      "out" : ["К474СЕ178"],
//      "input": ["А222РТ178"]
//    },
//   2 : {
//        "out" : ["К722АВ12", "А222РТ178"],
//        "input" : ["М001АВ01", "А023РВ73"],
//   }
// ..
//  }

//Список технологий:
// Set (HashSet) - узнать что это, set.contains(), set.put()
// Map (HashMap) - узнать что это, map.get(), map.put(), map.entrySet() - для итерации, entry.getValue(), entry.getKey()
// <Integer> - обозначает тип который хранится в этой структуре данных (Generics)
// Регулярные выражения - вытащить регион авто

import java.util.*;

public class ExpertTask {

    private static final char FIRST_LITER = 'М';
    private static final char SECOND_LITER = 'А';
    private static final char THIRD_LITER = 'В';


    public static void main(String[] args) {
        for (int i = 0; i < 5; i++)
            getCountSpecCar(GeneratorExpertHomework.getData());
    }

    public static void getCountSpecCar(Map<Integer, Map<String, String[]>> number) {
        Set<String> res = Collections.synchronizedSet(new HashSet<String>());
        for (Integer entry : number.keySet()) {
            for (String[] key : number.get(entry).values()) {
                res.addAll(List.of(key));
            }
        }
        int count = 0;
        for (String result : sortCarNumb(res)) {
            System.out.print(result + " | ");
            count++;
            if (count % 5 == 0) System.out.println();
        }
        System.out.println("\nВсего " + count + " автомобилей со спец. номером.");
    }

    public static HashSet<String> sortCarNumb(Set<String> res) {
        HashSet<String> result = new HashSet<>();
        String[] mas = res.toArray(new String[0]);
        for (String ma : mas) {
            if (equalsNumb(ma)) {
                result.add(ma);
            }
        }
        return result;
    }

    public static boolean equalsNumb(String num) {
        if (num.charAt(0) != FIRST_LITER || num.charAt(4) != SECOND_LITER || num.charAt(5) != THIRD_LITER) {
            return false;
        }
        return true;
    }
}
