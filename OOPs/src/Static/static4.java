package Static;
class Beta
{
    static int a;

    static
    {
        a=10;
        System.out.println("Static Init Block");
    }

    static void disp()
    {
        System.out.println(a);
    }
}
public class static4 {
    public static void main(String[] args) {
        Beta.disp();
        Beta b=new Beta();
        b.disp();
    }
}
