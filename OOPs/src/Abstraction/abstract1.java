package Abstraction;
abstract class Aeroplane1
{
    public abstract void takeOff();   
    public abstract void fly();

}
class Cargoplane extends Aeroplane1
{
    public void takeOff()
    {
        System.out.println("Cargoplane requires long runway to take off ");
    }
    public void fly()
    {
        System.out.println("Cargoplane flies at low height");
    }

}
class Fighterplane1 extends Aeroplane1
{
    public void takeOff()
    {
        System.out.println("Fighterplane requires shorter runway to take off ");
    }
    public void fly()
    {
        System.out.println("Fighterplane flies at high height");
    }

}
class Airport
{
    public void permit(Aeroplane1 ref)
    {
        ref.takeOff();
        ref.fly();
    }
}

public class abstract1 {
    public static void main(String[] args) {
        Cargoplane cp=new Cargoplane();
        Fighterplane1 fp=new Fighterplane1();
        Airport a=new Airport();
        a.permit(cp);
        a.permit(fp);
    }
    
}
