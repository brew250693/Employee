public class StaffPartTime extends Staff{
    private double timeWork;

    public StaffPartTime(String staffCode, String name, int age, int phoneNumber, String email, double timeWork) {
        super(staffCode, name, age, phoneNumber, email);
        this.timeWork = timeWork;
    }

    public double getTimeWork() {
        return timeWork;
    }

    public void setTimeWork(double timeWork) {
        this.timeWork = timeWork;
    }

    @Override
    public double getAmountOfStaffs() {
        return timeWork*100;
    }

    @Override
    public String toString() {
        return "StaffPartTime{" +
                "timeWork=" + timeWork +
                '}';
    }
}
