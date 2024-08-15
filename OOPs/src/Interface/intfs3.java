package Interface;
// interface Alpha
// {
//     // Marker interface :- A interface which does not contain any body.
// }
interface Calc1
{
    int add();
    int sub();
}
interface Calc2 extends Calc1
{
    int mul();
    int div();
}
class Calcu2 implements Calc1,Calc2
{

    public int mul() 
    {
        return 5*5;
    }
    public int div() 
    {
        return 25/5;
    }
    public int add() 
    {
        return 5+5;
    }
    public int sub() 
    {
        return 5-5;
    }
    
}

public class intfs3 {
    public static void main(String[] args) {
        // Calcu2 cal=new Calcu2();
        // System.out.println(cal.add());
        // System.out.println(cal.div());
        // System.out.println(cal.mul());
        // System.out.println(cal.sub());
        Calc1 cal=new Calcu2();
        System.out.println(cal.add());
        System.out.println(cal.sub());
        Calc2 calc=new Calcu2();
        System.out.println(calc.div());
        System.out.println(calc.mul());
    }
    
}
