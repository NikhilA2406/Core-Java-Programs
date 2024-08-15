package Encapsulation;
class StudentDB
{
    private String name;
    private int age;
    private double avg;
    // void setStudentdb(String x, int y, double z)
    // {
    //     name = x;
    //     age = y;
    //     avg = z;
    // }
    /*Using name, age, avg instead of x,y,z because it gives better appearence to another coder.
     * Using x,y,z it can't gives us the proper detail which one is string integer and double.
    */
    //Setter
    void setStudentdb(String name, int age, double avg)
    {
        this.name = name; //When there is naming conflict betweeen the local & instance variable within a method or setter 
        this.age = age;   //we called as a shadowing problem. For that using this keyword.
        this.avg = avg;
    }
    //Setter
    void setName(String name)
    {
        this.name = name;   
    }
    void setAge(int age)
    {
        this.age = age;   
    }
    void setAvg(double avg)
    {
        this.avg = avg;
    }
    //Getter
    String getName()
    {
        return name;
    }
    int getAge()
    {
        return age;
    }
    double getAvg()
    {
        return avg;
    }

}
public class encap2 {
    public static void main(String[] args) {
        StudentDB student1 = new StudentDB();
        student1.setStudentdb("Nikhil", 24, 74.4);
        System.out.println(student1.getName());
        System.out.println(student1.getAge());
        System.out.println(student1.getAvg());
        System.out.println("***********************************************");
        StudentDB student2 = new StudentDB();
        student2.setName("Nikhil");
        student2.setAge(24);
        student2.setAvg(74.4);
        System.out.println(student2.getName());
        System.out.println(student2.getAge());
        System.out.println(student2.getAvg());
    }
    
}
