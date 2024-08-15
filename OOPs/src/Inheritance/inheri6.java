package Inheritance;
class Animal
{
    int age =10;
    void show()
    {
        System.out.println("The Animal is Tiger");
    }
}
class Lion extends Animal
{
    int age = 20;
    void show()
    {
        super.show();
        System.out.println(age);
        System.out.println(super.age);//super keyword is used to access the variable of parent class
    }
}
public class inheri6 {
    public static void main(String[] args) {
        Lion lion=new Lion();
        lion.show();
    }
    
}
