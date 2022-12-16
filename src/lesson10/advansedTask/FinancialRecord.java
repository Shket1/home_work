package lesson10.advansedTask;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;

public class FinancialRecord {
    private int incomes;
    private int outcomes;

    public FinancialRecord(int incomes, int outcomes) {
        this.incomes = incomes;
        this.outcomes = outcomes;
    }

    public int getIncomes() {
        return incomes;
    }

    public void setIncomes(int incomes) {
        this.incomes = incomes;
    }

    public int getOutcomes() {
        return outcomes;
    }

    public void setOutcomes(int outcomes) {
        this.outcomes = outcomes;
    }
    public int[] getIncomesOutcomesRecord(String fileName) {
        String line = "";
        int outcomes = 0;
        int incomes = 0;
        int[] arr = new int[2];

        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(fileName));){
            while (bufferedReader.ready()) {
                line = bufferedReader.readLine();
                arr = splitLine(line).clone();
                incomes += arr[0];
                outcomes += arr[1];
            }
        } catch (IOException e) {
            e.getMessage();
        }
        arr[0] = incomes;
        arr[1] = outcomes;
        return arr;
    }
    public int[] splitLine(String line) {
        String[] res = line.split(" ");
        int[] res1 = {Integer.valueOf(res[0]), Integer.valueOf(res[1])};
        return res1;
    }
}
