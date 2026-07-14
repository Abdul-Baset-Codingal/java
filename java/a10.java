class Employee {

    private String name;
    private double salary;

    public void setName(String name) {
        this.name = name;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }
}

public class GetSetGo {
    public static void main(String[] args) {

        Employee emp = new Employee();

        emp.setName("John");
        emp.setSalary(45000);

        System.out.println("Employee Name: " + emp.getName());
        System.out.println("Employee Salary: $" + emp.getSalary());
    }
}