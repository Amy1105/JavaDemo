public class Employee {

    private String name;
    private double salary;
    private MyDate hireDay;
    private double actualSalary;

    public Employee(String n, double s, MyDate date) {
        name = n;
        salary = s;
        hireDay = date;
    }

    public void getRaiseSalary(double percent) {
        actualSalary = percent * salary;
    }

    public void print() {
        System.out.println(name + ":工资：" + salary + ",实际工资：" + actualSalary + "，入职时间：" + hireDay.getDateString());
    }
}