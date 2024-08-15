package Inheritance;
class Aeroplane1
{
    public void takeOff()
    {
        System.out.println("Aeroplane is taking off");
    }
    public void fly()
    {
        System.out.println("Aeroplane is flying");
    }

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

public class inheri8 {
    public static void main(String[] args) {
        Cargoplane cp=new Cargoplane();
        Fighterplane1 fp=new Fighterplane1();

        // cp.takeOff();
        // cp.fly();

        // fp.takeOff();
        // fp.fly();
        // Aeroplane1 ref;
        // ref=cp;
        // ref.takeOff();
        // ref.fly();
        // ref=fp;
        // ref.takeOff();
        // ref.fly();
        Airport a=new Airport();
        a.permit(cp);
        a.permit(fp);
    }
    
}
