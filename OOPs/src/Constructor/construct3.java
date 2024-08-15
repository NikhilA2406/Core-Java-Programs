package Constructor;
class Alpha
{
    int a, b;
    Alpha()
    {
        this(44);
        System.out.println("Zero Param Constructor");
        a=10;
        b=20;
    }
    Alpha(int x)
    {
        System.out.println("1 Param Constructor");
        a=x;
    }
    Alpha(int x, int y)
    {
        this();
        System.out.println("2 Param Constructor");
        a=x;
        b=y;
    }
    void disp()
    {
        System.out.println(a);
        System.out.println(b);
    }
}

public class construct3 {
    public static void main(String[] args) {
        Alpha alpha1=new Alpha();
        alpha1.disp();

        Alpha alpha2=new Alpha(2, 1);
        alpha2.disp();
    }
}
