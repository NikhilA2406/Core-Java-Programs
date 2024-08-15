package Interface;
interface Calculator1
{
    double pi=3.14;//public static final double pi=3.14;
    int add();
    int sub();
}
interface Calculator2 extends Calculator1
{
    int mul();
    int div();
}
class Calcu implements Calculator2
{

    
    public int add() 
    {
        return 24+25;
    }
    public int sub() 
    {
        return 25-24;
    }
    public int mul() 
    {
        return 25*24; 
    }
    public int div() 
    {
        return 24/25;
    }


}

public class intfs2 {
    public static void main(String[] args) {
        Calcu c=new Calcu();
        System.out.println(c.add());
        System.out.println(c.sub());
        System.out.println(c.mul());
        System.out.println(c.div());
        //System.out.println(Calculator1.pi=10);
    }
}
