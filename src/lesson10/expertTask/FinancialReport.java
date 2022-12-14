package lesson10.expertTask;

import java.io.BufferedReader;
import java.io.FileReader;

// Задача №1
// Необходимо составить отчет о итоговой прибыли за каждый месяц по магазину pyterochka
// Формат ожидаемого результат:
// Прибыль по магазину pyterochka по месяцам
// 01.2012: 20000.00
// 02.2012: -100332.00
// и тд
public class FinancialReport {
    private final String SEPARATOR_CHARACTER = ";";

    public String getIncomeStatementForAllMonths(String fileName, String shopName, String incomeOutcome) {
        String line = "";
        String data = "";
        double income = 0;
        int count = 0;
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(fileName));){
            while (bufferedReader.ready()) {
                line = bufferedReader.readLine();
                if (line.contains(shopName.toLowerCase())) {
                    income += getIncome(line, incomeOutcome);
                    count++;
                }
                if (data.isEmpty() && count > 0) {
                    data = getMonth(line);
                }
            }
        } catch (Exception e) {
            e.getMessage();
        }
        income = (Math.ceil(income * 100)) / 100;
        String result = data + ": " + income;
        return result;
    }

    public double getIncome(String line, String incomeOutcome) {
        String[] mas = line.split(SEPARATOR_CHARACTER);
        double res = switch (incomeOutcome.toLowerCase()) {
            case "income" -> Double.parseDouble(mas[1]);
            case "outcome" -> Double.parseDouble(mas[2]);
            default -> 0;
        };
        return res;

    }

    public String getMonth(String line) {
        String data = line.substring(line.indexOf('/') + 1);
        if (data.indexOf("/") == 1) {
            data = "0" + data;
        }
        return data.replaceAll("/", ".");
    }
}
