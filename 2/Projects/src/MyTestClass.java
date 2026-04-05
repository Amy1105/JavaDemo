public class MyTestClass {
    public static void main(String[] args) {
        Employee[] employees = new Employee[3];
        employees[0] = new Employee("Tom", 3000, new MyDate());
        employees[1] = new Employee("Jerry", 3500, new MyDate(2020, 12, 12));
        employees[2] = new Employee("Liliy", 6000, new MyDate(2025, 11, 11));
        int integerValue;

        for (integerValue = 0; integerValue < 3; integerValue++) {
            employees[integerValue].getRaiseSalary(0.9);
            employees[integerValue].print();
        }
    }
}
