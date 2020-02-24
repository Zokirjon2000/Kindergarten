package Kindergarten;

public class Employee implements Comparable<Employee> {
    private String FirstName;
    private String LastName;
    private String employee;
    private String Unversite;
    private String Year;

    public Employee(String firstName, String lastName, String employee, String unversite, String year) {
        FirstName = firstName;
        LastName = lastName;
        this.employee = employee;
        Unversite = unversite;
        Year = year;
    }

    public String getFirstName() {
        return FirstName;
    }

    public void setFirstName(String firstName) {
        FirstName = firstName;
    }

    public String getLastName() {
        return LastName;
    }

    public void setLastName(String lastName) {
        LastName = lastName;
    }

    public String getEmployee() {
        return employee;
    }

    public void setEmployee(String employee) {
        this.employee = employee;
    }

    public String getUnversite() {
        return Unversite;
    }

    public void setUnversite(String unversite) {
        Unversite = unversite;
    }

    public String getYear() {
        return Year;
    }

    public void setYear(String year) {
        Year = year;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "FirstName='" + FirstName + '\'' +
                ", LastName='" + LastName + '\'' +
                ", employee='" + employee + '\'' +
                ", Unversite='" + Unversite + '\'' +
                ", Year='" + Year + '\'' +
                '}';
    }

    @Override
    public int compareTo(Employee o) {
        return this.getFirstName().compareTo(o.getFirstName());
    }
}
