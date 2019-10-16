package employee;

public class SalariedEmployee extends Employee {
    private double monthSalary;

    public double getMonthSalary() {
        return monthSalary;
    }

    public void setMonthSalary(double monthSalary) {
        if (monthSalary >= 0) {
            this.monthSalary = monthSalary;
        }
    }

    public SalariedEmployee(String name,MyDate birthday, double monthSalary) {
        super(name,birthday);
        this.monthSalary = monthSalary;
    }

    public double earnings(Employee e) {
        return this.getMonthSalary();
    }

    @Override
    public String toString() {
        return "employee.SalariedEmployee{" + super.toString() +
                ", monthSalary=" + this.getMonthSalary() + '}';
    }
}
