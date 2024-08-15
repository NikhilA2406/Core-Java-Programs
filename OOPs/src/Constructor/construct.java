package Constructor;
class Student2
{
    private String name;
    private int age;
    private double avg;
    Student2(String name, int age, double avg){//This is also the way to declare the method without any
        this.name = name;                      //return type and access specifier known as constructor.
        this.age = age;                        //The name of the constructor will be the same as class name.
        this.avg = avg;
    }
    public String getName() {
        return name;
    }
    public int getAge() {
        return age;
    }
    public double getAvg() {
        return avg;
    }

}
public class construct {
    public static void main(String[] args) {
        Student2 student1 = new Student2("Nikhil", 24, 74.75);//during the object creation this is the call to the constructor
        System.out.println(student1.getName());
        System.out.println(student1.getAge());
        System.out.println(student1.getAvg());
    }
    
}
