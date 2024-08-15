package Static;
class Demo
{
    static int x,y;
    int a,b;
    static 
    {
        x=10;
        y=20;
        System.out.println("Static Block");
    }
    {
        a=100;
        b=200;
        System.out.println("Java or Instance Initialization  Block (Non Static Block)");
    }

    Demo()
    {
        System.out.println("Zero Param Constructor");
    }
    static void disp()
    {
        System.out.println(x);
        System.out.println(y);
    }
    void show()
    {
        System.out.println(a);
        System.out.println(b);
    }
}

public class static3 {
    public static void main(String[] args) {
        Demo.disp();
        Demo d=new Demo();
        d.show();

        
    }
    
}
