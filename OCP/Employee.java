package OCP;


public abstract class Employee {
    protected String id;
    protected String name;
    protected double basicSalary;

    public Employee() {

    }

    public Employee(String id, String name, double basicSalary) {
        this.id = id;
        this.name = name;
        this.basicSalary = basicSalary;
    }

    public abstract double calcHoursBonus(double hours);

    @Override
    public String toString() {
        return "Id: " + id + "\nName: " + name + "\nBasic Salary: " + basicSalary;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getBasicSalary() {
        return basicSalary;
    }

    public void setBasicSalary(double basicSalary) {
        this.basicSalary = basicSalary;
    }

}
