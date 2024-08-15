package Constructor;
class Demo1{
    int x;
    double y;

    Demo1()
    {
        System.out.println("Zero Pram Constructor");
    }
    Demo1(int x, double y)
    {
        this();
        this.x=x;
        this.y=y;
    }

}

public class construct2 {
    public static void main(String[] args) {
        Demo1 d1=new Demo1();
        Demo1 d2=new Demo1(24, 25);

    }
    
}
