package Inheritance;
class Animal 
{
    private int age;

    void eat()
    {
        System.out.println("Animal eats a lot");
    }
}
class Tiger extends Animal
{
    // void eat()
    // {
    //     age=4;
    //     System.out.println("Tiger hunts and eats and age is"+age);
    // }

}
class Cubs extends Tiger
 {

}
public class inheri3 {
    public static void main(String[] args) {
        Animal tiger=new Tiger();
        tiger.eat();
        
        Cubs c=new Cubs();
        c.eat();
    }
    
}
