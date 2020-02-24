package Kindergarten;

public class Childeren implements Comparable<Childeren> {
    private String FirstName;
    private String LastName;
    private int age;
    private String nationality;
    private String Group;
    private String security;

    public Childeren(String firstName, String lastName, int age, String nationality, String group, String security) {
        FirstName = firstName;
        LastName = lastName;
        this.age = age;
        this.nationality = nationality;
        Group = group;
        this.security = security;
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

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    public String getGroup() {
        return Group;
    }

    public void setGroup(String group) {
        Group = group;
    }

    public String getSecurity() {
        return security;
    }

    public void setSecurity(String security) {
        this.security = security;
    }

    @Override
    public String toString() {
        return "Childeren{" +
                "FirstName='" + FirstName + '\'' +
                ", LastName='" + LastName + '\'' +
                ", age=" + age +
                ", nationality='" + nationality + '\'' +
                ", Group='" + Group + '\'' +
                ", security='" + security + '\'' +
                '}';
    }

    @Override
    public int compareTo(Childeren o) {
        return this.getFirstName().compareTo(o.getFirstName());
    }
}
