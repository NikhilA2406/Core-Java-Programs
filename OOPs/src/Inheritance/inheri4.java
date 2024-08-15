package Inheritance;
class Demo1
{
    int a,b;
    Demo1()
    {
        System.out.println("Zero Param Demo 1 Constructor");
        a=10;
        b=20;
    }
    Demo1(int a, int b)
    {
        System.out.println("Param Demo 1 Constructor");
        this.a=a;
        this.b=b;
    }
}
class Demo2 extends Demo1
{
    int x,y;

    Demo2()
    {
        this(1,2);
        x=10;
        y=20;
        System.out.println("Zero Param Demo 2 Constructor");
    }
    Demo2(int x, int y)
    {
        this.x=x;
        this.y=y;
        System.out.println("Param Demo 2 Constructor");
    }
    void disp()
    {
        System.out.println(a+" "+b+" "+x+" "+y);
    }

}

public class inheri4 {
    public static void main(String[] args) {
        Demo2 d=new Demo2();
        d.disp();
        
    }
    
}
