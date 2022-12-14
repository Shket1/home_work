package lesson2;

public class HomeWorkTest {
    public static void main(String[] args) {
        System.out.println("Ответ к Задаче 1: " + taskOne());
        System.out.println("Ответ к Задаче 2: " + taskTwo(3, 5));
        System.out.println("Ответ к Задаче 3: " + repairInvoice());
        String str = "<client>(Какие то данные)<data>79991113344 ;test@yandex.ru;Иванов Иван Иванович</data></client>";
        System.out.println(ExpertTask.dataMasking(str));
    }
    //Задача №1
    //Произвести преобразование "234" в число типа int и прибавить к этому числу длину строки "some_text"

    static int taskOne() {
        String num = "234";
        String text = "some_text";
        int res = Integer.parseInt(num) + text.length();
        return res;
    }
    //Задача №2
    //Посчитать (a+b)^2 = ?, при a=3, b=5

    static int taskTwo(int a, int b) {
        return (int) Math.pow((a + b), 2);
    }

    /*
    // Задание №3:
        // Дано:
        boolean hasFuel = true;
        boolean hasElectricsProblem = false;
        boolean hasMotorProblem = false;
        boolean hasTransmissionProblem = true;
        boolean hasWheelsProblem = true;
        // В автосервис приехала сломанная машина. Механики находят неисправность следующим способом:
        // Если у машины нет бензина и ничего не сломано, то отдают машину владельцу и берут 1000 рублей за консультацию.
        // Если у машины проблема с двигателем, то чинят и берут 10 000.
        // Если у машины проблема с электрикой, то чинят и берут 5000.
        // Если у машины проблема с коробкой передач, то чинят и берут 4000.
        // Если у машины проблема с колесами, то чинят и берут 2000.
        // Если две детали сломаны, то на общий счет идет скидка 10%.
        // Если сломана коробка передач, и электрика или двигатель, то на общий счет скидка 20%.
        // Если нет бензина и что-то сломано, то за консультацию денег не берут.
        // Ситуации, что бензин есть и ничего не сломано - быть не может.
        // Ожидаемый результат: выведен на экран счет клиенту.
     */
    static double repairInvoice() {
        boolean hasFuel = true;
        boolean hasElectricsProblem = false;
        boolean hasMotorProblem = false;
        boolean hasTransmissionProblem = false;
        boolean hasWheelsProblem = false;
        double result = 0;
        int count = 0;
        if (hasFuel && !(hasElectricsProblem || hasMotorProblem || hasWheelsProblem || hasTransmissionProblem)) {
            result += 1000;
            count++;
        }
        if (hasMotorProblem) {
            result += 10000;
            count++;
        }
        if (hasElectricsProblem) {
            result += 5000;
            count++;
        }
        if (hasTransmissionProblem){
            result += 4000;
            count++;
        }
        if (hasWheelsProblem){
            result += 2000;
            count++;
        }
        if (count == 2) {
            if (hasTransmissionProblem && (hasElectricsProblem || hasMotorProblem)) result *= 0.8;
            else result *= 0.9;
        }
        return result;
    }
}
