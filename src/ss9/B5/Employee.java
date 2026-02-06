package ss9.B5;

abstract class Employee {
    protected String name;

    public Employee(String name) {
        this.name = name;
    }

    // phương thức đa hình
    public abstract double calculateSalary();

    public String getName() {
        return name;
    }
}
