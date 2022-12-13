package lesson8.advansedTask;

public class Shop {
    private Employment[] employments;
    public void addEmployments(Employment[] employments) {
        this.employments = employments.clone();
    }

    public Employment getEmployment(int i) {
        if (employments.length > 0) {
            return employments[i];
        } else {
            return null;
        }
    }
}
