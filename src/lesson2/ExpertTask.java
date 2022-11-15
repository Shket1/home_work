package lesson2;

/*
//Экспертный уровень
        Задача №1
        Создать метод маскирования персональных данных, который:
        Телефон (до/после маскирования): 79991113344 / 7999***3344
        Email (до/после маскирования): test@yandex.ru / tes*@******.ru, my_mail@gmail.com / my_mai*@*****.com
        Фио (до/после маскирования): Иванов Иван Иванович / И****в Иван И.

        Входящие параметры: String text
        Возвращаемый результат: String

        Примеры возможного текста:
        <client>(Какие то данные)<data>79991113344;test@yandex.ru;Иванов Иван Иванович</data></client> -
         "<client>(Какие то данные)<data>7999***3344;tes*@******.ru;И****в Иван И.</data></client>"
        <client>(Какие то данные)<data></data></client> - вернет тоже (никаких ошибок)
        <client>(Какие то данные)<data>Иванов Иван Иванович;79991113344</data></client> - "<client>(Какие то данные)<data>И****в Иван И.;7999***3344</data></client>"

        Используемые технологии: String.find, String.replaceAll, String.split, String.join, String.contains, String.substring
        Регулярные выражения, класс StringBuilder
 */

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ExpertTask {
    public static String dataMasking(String str) {
        StringBuilder sb = new StringBuilder(str);

        Pattern pPhone = Pattern.compile("\\d{11}");
        Matcher phone = pPhone.matcher(sb);

        Pattern pEmail = Pattern.compile("[A-z0-9+_.-]+@");
        Matcher email = pEmail.matcher(sb);

        Pattern pEmail1 = Pattern.compile("@\\w+");
        Matcher email1 = pEmail1.matcher(sb);

        Pattern pSurname = Pattern.compile(";[А-я]+");
        Matcher surname = pSurname.matcher(sb);

        Pattern pPatronymic = Pattern.compile("\\s[А-я]+<");
        Matcher patronymic = pPatronymic.matcher(sb);

        if (phone.find()) {
            sb.replace(phone.start() + 4, phone.start() + 7, "***");
        }

        if (email.find() && email1.find()) {
            sb.replace(email.end()-2, email.end()-1, "*");
            sb.replace(email1.start() + 1, email1.end(), (stars(email1.group().length()-1)));
        }

        if (surname.find() && patronymic.find()) {
            sb.replace((surname.start() + 2), (surname.end() -1), (stars(surname.group().length() - 3)));
            sb.delete((patronymic.start() + 2), (patronymic.end() - 1));
            sb.insert(patronymic.start() + 2, ".");
        }
        return sb.toString();
    }

    static String stars(int n) {
        String res = "";
        while (n != 0) {
            res += "*";
            n--;
        }
        return res;
    }
}
