public class Manager extends EmployeeS{

    public Manager(String name, double salary, String address, String title){
        super(name, salary, address, title);
    }

    @Override
    public double Bonuses() {
        return super.getSalary() * 12;
    }

    @Override
    public String PerformanceReport() {
        return "Read..";
    }

    @Override
    public String Projects() {
        return "Read...";
    }

    public static void main(String[] args) {
        Manager manager = new Manager("sammy", 150000, "134-kisii", "Engineer");

        System.out.println(manager.Bonuses());
    }
}
