package OCP;

public class ManagerEmployee extends Employee implements IEmployee {
    public ManagerEmployee() {

    }

    public ManagerEmployee(String id, String name, double basicSalary) {
        super(id, name, basicSalary);
    }

    @Override
    public double calcHoursBonus(double hours) {
        return (((basicSalary / 30) / 8) * hours) * 2;
    }

    @Override
    public String toString() {
        return super.toString();
    }

    @Override
    public double calcHoursBonusUsingInterface(double hours) {
        return (((basicSalary / 30) / 8) * hours) * 2;

    }

}