package lesson8.advansedTask;

public class Employment implements Clock{

    private String nameEmployment;

    public Employment(String nameEmployment) {
        this.nameEmployment = nameEmployment;
    }

    public String getNameEmployment() {
        return nameEmployment;
    }

    public void setNameEmployment(String nameEmployment) {
        this.nameEmployment = nameEmployment;
    }

    @Override
    public void tick(boolean isTick) throws WatchBrokenError {
        if (isTick) {
            System.out.println("Часы тикают");
        }
        throw new WatchBrokenError("Часы сломались.");
    }
}
