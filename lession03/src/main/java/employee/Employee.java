package employee;

import java.util.Calendar;

public abstract class Employee {
    private String name;
    private int num;
    private MyDate birthday;
    private static int no = 1000;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public MyDate getBirthday() {
        return birthday;
    }

    public void setBirthday(MyDate birthday) {
        this.birthday = birthday;
    }

    public abstract double earnings(Employee e);

    public Employee(String name, MyDate birthday) {
        this.name = name;
        this.num = no++;
        this.birthday = birthday;
    }

    @Override
    public String toString() {
        return "name='" + name + '\'' +
                ", num=" + num +
                ", birthday=" + birthday.toDateString();
    }
}
class MyDate{
    private int year;
    private int month;
    private int day;

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        if (this.year>1900 && this.year <= Calendar.getInstance().get(Calendar.YEAR)) {
            this.year = year;
        }
        else {
            System.out.println("年格式有误");
        }
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        if (this.month >= 1 && this.month <= 12) {
            this.month = month;
        }
        else {
            System.out.println("月格式有误");
        }
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
        if (this.day >= 1 && this.day <= 31) {
            this.day = day;
        }
        else {
            System.out.println("日格式有误");
        }
    }

    public MyDate(int year, int month, int day) {
        this.year = year;
        this.month = month;
        this.day = day;
    }

    public String toDateString(){
        String sDate = year + "年" + month + "月" + day + "日";
        return sDate;
    }
}
