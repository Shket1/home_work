package lesson10.expertTask;

//Экспертный уровень
// Дано: папка, внутри которой находятся файлы, следующего именования - report_01_2012.txt, где 01 - месяц,
// 2012 - год
// Внутри файла следующий формат:
// pyterochka;122300.20;100312.10;20/01/2012
// pyterochka;299922.00;323333.02;21/01/2012
// perekrestok;9920.20;28200.01;21/01/2012
// Где pyterochka - название магазина; 122300.20 - доход; 100312.10 - расход, 20/01/2012 - дата операции

//Сгенерировать отчеты нужно через DataGenerator
//В path указать путь до папки, где сгенерятся отчеты
//String path = "";
//DataGenerator.createReports(path);

// Задача №1
// Необходимо составить отчет о итоговой прибыли за каждый месяц по магазину pyterochka
// Формат ожидаемого результат:
// Прибыль по магазину pyterochka по месяцам
// 01.2012: 20000.00
// 02.2012: -100332.00
// и тд


// Задача №2
// Необходим составить отчет о расходах всех магазинов за весь период в разбивке по магазинам
// (т.е. прочитать все файлы внутри папки)
// Формат ожидаемого результат:
// Расходы pyterochka за весь период: 20032220.00
// Расходы perekrestok за весь период: 1734220.00
// .. и тд
public class Runner {
    public static void main(String[] args) {
        String shopName = "pyterochka";
        String fileName = "G:\\Users\\User\\IdeaProjects\\HomeWork\\src\\lesson10\\expertTask\\report_01_2012.txt";
        FinancialReport financialReport = new FinancialReport();
        for (int i = 1; i <= 12; i++) {
            if (i < 10) {
                fileName = "G:\\Users\\User\\IdeaProjects\\HomeWork\\src\\lesson10\\expertTask\\report_"+ "0" + i +"_2012.txt";
            } else {
                fileName = "G:\\Users\\User\\IdeaProjects\\HomeWork\\src\\lesson10\\expertTask\\report_" + i +"_2012.txt";
            }
            System.out.println(financialReport.getReportForAllMonths(fileName, shopName));
        }
    }
}
