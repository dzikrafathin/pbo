public class Employee {
    
    private String name;
    private long id;
    private double salary;

    public Employee(String name, long id) {
        this.name = name;
        this.id = id;
    }

    public String getName() {
        return this.name;
    }
    public long getID() {
        return this.id;
    }

    public double getSalary() {
        return this.salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}