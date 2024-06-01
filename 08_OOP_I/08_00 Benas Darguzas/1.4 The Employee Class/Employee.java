public class Employee {
    private final int id;
    private final String firstName;
    private final String lastName;
    private int salary;


    public Employee(int id, String firstName, String lastName, int salary) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.salary = salary;

    }
    public void raiseSalary(int percent) {
        this.salary += salary * ((double)percent / 100);
        System.out.println("Increasing monthly salary by " + percent + "%");
    }
    public int getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getSalary() {
        return salary;
    }

    public String getName() {
        return firstName + " " + lastName;
    }

    public void setSalary(int newSalary) {
        salary = newSalary;
    }

    public int getAnnualSalary() {
        return salary * 12;
    }


    public String toString(){
        return "Employee [id = " + id + ", name = " + firstName + ", lastname = " + lastName + ", salary = " + salary + " ]";
    }
}


