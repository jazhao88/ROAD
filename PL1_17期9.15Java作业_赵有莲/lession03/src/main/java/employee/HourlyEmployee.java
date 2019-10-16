package employee;

public class HourlyEmployee extends Employee {
    private double wage;
    private int hour;
    public double earnings(Employee e) {
        return this.getHour() * this.getWage();
    }

    public double getWage() {
        return wage;
    }

    public void setWage(double wage) {
        this.wage = wage;
    }

    public int getHour() {
        return hour;
    }

    public void setHour(int hour) {
        this.hour = hour;
    }

    public HourlyEmployee(String name, MyDate birthday, double wage, int hour) {
        super(name, birthday);
        this.wage = wage;
        this.hour = hour;
    }

    @Override
    public String toString() {
        return "employee.HourlyEmployee{" + super.toString() +
                ", wage=" + this.getWage() + ", hour=" + this.getHour() + '}';
    }
}
