package Inheritance;
class Alpha1
{
    int a, b;

    Alpha1()
    {
        System.out.println("Zero Param Cons Alpha1-P ");
        a=10;
        b=20;
    }
    Alpha1(int a, int b)
    {
        this();
        System.out.println("Param Cons Alpha-P");
        this.a=a;
        this.b=b;    
    }
}
class Beta1 extends Alpha1
{
    int c,d;

    Beta1()
    {
        super(100,200);
        c=1;
        d=2;
        System.out.println("Zero Param cons Beta-c");
    }
    Beta1(int c , int d)
    {
        this();
        this.c=c;
        this.d=d;
        System.out.println("Param cons Beta-c");
    }
    void disp()
    {
        System.out.println("a:"+a+", b:"+b+", c:"+c+", d:"+d);
    }
}
public class inheri5 {
    public static void main(String[] args) {
        Beta1 beta=new Beta1(100,200);
        beta.disp();  
    }
    
}
