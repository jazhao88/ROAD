package employee;

import java.util.ArrayList;
import java.util.Calendar;

public class PayrollSystem {
    private static double prize = 100;
    public ArrayList<Employee> employees;

    public PayrollSystem(ArrayList<Employee> employees) {
        this.employees = employees;
    }

    public void printEmployeeInfo(){
        String info = new String();
        int month = Calendar.getInstance().get(Calendar.MONTH) + 1;
        for (Employee employee:this.employees) {
            info = employee.toString() +
                    "\n当月薪资：" + employee.earnings(employee);
            if ( employee.getBirthday().getMonth() == month){
                info = info + "\t当月增加工资：" + prize;
            }
            System.out.println(info);
        }
    }

    public static void main(String[] args) {
        ArrayList<Employee> list = new ArrayList<Employee>();
        SalariedEmployee employee01 =
                new SalariedEmployee("张三",
                        new MyDate(1988,8,5),7500);
        SalariedEmployee employee02 =
                new SalariedEmployee("李四",
                        new MyDate(1990,9,5),6500);
        HourlyEmployee employee03 =
                new HourlyEmployee("王二",
                        new MyDate(1987,1,5),35,57);
        HourlyEmployee employee04 =
                new HourlyEmployee("赵一",
                        new MyDate(1987,9,5),40,50);
        list.add(employee01);
        list.add(employee02);
        list.add(employee03);
        list.add(employee04);
        PayrollSystem ps = new PayrollSystem(list);
        ps.printEmployeeInfo();
    }

}
