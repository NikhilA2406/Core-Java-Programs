package Constructor;
class Demo
{
    String name;
    int age;
    // Demo() It is by default if we are not writing this it is understandable tha constructor have zere parameters.
    // {
    //     super();super method is the first statement of the constructor wheather we write or don't write the super method.
    //     System.out.println("Zero Perameterized");
    // } if we are defining any constructor then the default constructor with zero parameters will be deleted automatically.
    Demo(String name, int age)
    {
        this.name=name;
        this.age=age; 
    }
    public String getName() {
        return name;
    }
    public int getAge() {
        return age;
    }

}

public class construct1 {
    public static void main(String[] args) {
        //Demo d = new Demo();
        Demo d = new Demo("Nikhil",24);
        System.out.println(d.getName());
        System.out.println(d.getAge());

    }
    
}
