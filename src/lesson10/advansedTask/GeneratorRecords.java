package lesson10.advansedTask;

//Продвинутый уровень
//Задача №1
// 1. Создать класс FinancialRecord, с двумя атрибутами: incomes, outcomes (доходы, расходы)
// 2. Создать в этом классе геттеры, сеттеры и конструктор на все атрибуты
// 3. Создать 10 отчетов (объектов класса FinancialRecord),
// с разными доходами и расходами (Смотри класс new Random(1).nextInt(10000) )
// 4. Записать в файл "report_2.txt" все данные из отчетов.
// 5. Прочитать файл report_2.txt, просуммировать все доходы и вывести на экран,
// то же самое с расходами
// Ожидаемый результат: общие доходы - (какое то число), общие расходы - (какое то число)

import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;

public class GeneratorRecords {
    private static Random random = new Random(1);
    public static void main(String[] args) {
        FinancialRecord financialRecord = new FinancialRecord(random.nextInt(10000), random.nextInt(10000));
        String fileName = "G:\\Users\\User\\IdeaProjects\\HomeWork\\src\\lesson10\\advansedTask\\Record1";
        int i = 0;
        do {
            try (FileWriter fileWriter = new FileWriter(fileName, true);){
                fileWriter.write(String.valueOf(financialRecord.getIncomes()));
                fileWriter.append(' ');
                fileWriter.write(String.valueOf(financialRecord.getOutcomes()));
                fileWriter.append('\n');
                financialRecord.setIncomes(random.nextInt(10000));
                System.out.println(financialRecord.getIncomes());
                financialRecord.setOutcomes(random.nextInt(10000));
                System.out.println(financialRecord.getOutcomes());
            } catch (IOException e) {
                System.out.println(e.getMessage());
            }
            i++;
        } while (i < 21);
        int[] arr = financialRecord.getIncomesOutcomesRecord(fileName).clone();
        System.out.println("Общие доходы - " + arr[0] + " Общие расходы - " + arr[1]);
    }
}
