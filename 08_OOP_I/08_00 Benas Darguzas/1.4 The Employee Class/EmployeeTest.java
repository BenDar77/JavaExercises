public class EmployeeTest {
    public static void main(String[] args) {
Employee e1 = new Employee(1, "Benas", "Darguzas", 1000 );

        System.out.println(e1);
        System.out.println(e1.getId());
        System.out.println(e1.getFirstName());
        System.out.println(e1.getLastName());
        System.out.println(e1.getName());
        System.out.println(e1.getSalary());
        e1.setSalary(1200);
        System.out.println(e1.getSalary());
        System.out.println(e1.getAnnualSalary());
        e1.raiseSalary(20);
        System.out.println(e1.getAnnualSalary());
    }
}
