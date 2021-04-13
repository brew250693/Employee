public class StaffFullTime extends Staff{
    private double moneyBonus;
    private double moneyFine;
    private double hardSalary;

    public StaffFullTime(String staffCode, String name, int age, int phoneNumber, String email, double moneyBonus, double moneyFine, double hardSalary) {
        super(staffCode, name, age, phoneNumber, email);
        this.moneyBonus = moneyBonus;
        this.moneyFine = moneyFine;
        this.hardSalary = hardSalary;
    }

    public double getMoneyBonus() {
        return moneyBonus;
    }

    public void setMoneyBonus(double moneyBonus) {
        this.moneyBonus = moneyBonus;
    }

    public double getMoneyFine() {
        return moneyFine;
    }

    public void setMoneyFine(double moneyFine) {
        this.moneyFine = moneyFine;
    }

    public double getHardSalary() {
        return hardSalary;
    }

    public void setHardSalary(double hardSalary) {
        this.hardSalary = hardSalary;
    }

    @Override
    public double getAmountOfStaffs() {
        return hardSalary + moneyBonus - moneyFine;

    }

    @Override
    public String toString() {
        return "StaffFullTime{" +
                "moneyBonus=" + moneyBonus +
                ", moneyFine=" + moneyFine +
                ", hardSalary=" + hardSalary +
                '}';
    }
}
