package lesson8.advansedTask;

public class WatchBrokenError extends Throwable{

    private String detailMassage;
    public WatchBrokenError(String massage) {
        this.detailMassage = massage;
    }

    @Override
    public String getMessage() {
        return detailMassage;
    }
}
