package lesson6.advansedTask.task2;

public class Stock {

    private final String VODKA = "Водка";
    private int amountOfVodka;

    public Stock(int amountOfVodka) {
        this.amountOfVodka = amountOfVodka;
    }

    public int getAmountOfVodka() {
        return amountOfVodka;
    }

    public void setAmountOfVodka(int amountOfVodka) {
        this.amountOfVodka = amountOfVodka;
    }

    public int getVodka() {
        if (amountOfVodka == 0) {
            return 0;
        } else {
            amountOfVodka--;
            return 1;
        }
    }
}
