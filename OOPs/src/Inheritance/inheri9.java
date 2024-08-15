package Inheritance;
class Animal1
{
    public void eat()
    {
        System.out.println("Animal eat a lot");
    }

}
class Tiger1 extends Animal1
{

}
class Monkey extends Animal1
{

}
class Deer extends Animal1
{

}
class Forest
{
    public  void permit(Animal1 ref)
    {
        ref.eat();//one to many
    }
}
public class inheri9 {
    public static void main(String[] args) {
     Tiger1 t=new Tiger1();
     Monkey m=new Monkey();
     Deer d=new Deer();
     Forest f=new Forest();
     f.permit(t);
     f.permit(m);
     f.permit(d);   
    }
    
}
