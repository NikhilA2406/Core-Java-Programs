package Encapsulation;
class Employeedb
{
    private String name;
    private int age;
    private double salary;
    private String city;
    //Left click => Click on the Source Action => Then Click on the Generate Getter & Setter.
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public double getSalary() {
        return salary;
    }
    public void setSalary(double salary) {
        this.salary = salary;
    }
    public String getCity() {
        return city;
    }
    public void setCity(String city) {
        this.city = city;
    }
    
}

public class encap3 {
    public static void main(String[] args) {
        Employeedb empl=new Employeedb();
        empl.setName("Nikhil");
        empl.setAge(24);
        empl.setSalary(25000);
        empl.setCity("Raipur");
        System.out.println(empl.getName());
        System.out.println(empl.getAge());
        System.out.println(empl.getSalary());
        System.out.println(empl.getCity());

    }
    
}
