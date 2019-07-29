package staff;

public class Employee {

    private String name;
    private String NINumber;
    private double salary;

    public Employee(String name, String NINumber, double salary) {
        this.name = name;
        this.NINumber = NINumber;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public String getNINumber() {
        return NINumber;
    }

    public double getSalary() {
        return salary;
    }

    public void raiseSalary(double amount) {
        if (amount >= 0.0) {
            this.salary += amount;
        }
    }

    public double payBonus() {
        return getSalary() / 100;
    }

    public void setName(String name) {
        if (!name.equals(null)) {
            this.name = name;
        }
    }
}
