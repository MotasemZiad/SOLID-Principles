package OCP;

public class RegularEmployee extends Employee implements IEmployee {
    public RegularEmployee() {
    }

    public RegularEmployee(String id, String name, double basicSalary) {
        super(id, name, basicSalary);
    }

    @Override
    public double calcHoursBonus(double hours) {
        return ((basicSalary / 30) / 8) * hours;
    }

    @Override
    public String toString() {
        return super.toString();
    }

    @Override
    public double calcHoursBonusUsingInterface(double hours) {
        return ((basicSalary / 30) / 8) * hours;

    }

}