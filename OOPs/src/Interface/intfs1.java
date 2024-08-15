package Interface;
import java.util.*;
interface Calc
{
    void add();//public abstract void add()
    void sub();//public abstract void sub()
}
class MyCalc1 implements Calc
{
    //public abstract void add()
    public void add()
    {
        int a=10;
        int b=20;
        int res=a+b;
        System.out.println(res);
    }
    //public abstract void sub()
    public void sub()
    {
        int a=10;
        int b=20;
        int res=a-b;
        System.out.println(res);

    }
}
class MyCalc2 implements Calc
{
     //public abstract void add()
     public void add()
     {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value of a");
        int a=sc.nextInt();
        System.out.println("Enter the value of a");
        int b=sc.nextInt();
        System.out.println("The Result is");
        int res=a+b;
        System.out.println(res);
     }
     //public abstract void sub()
     public void sub()
     {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value of a");
        int a=sc.nextInt();
        System.out.println("Enter the value of a");
        int b=sc.nextInt();
        System.out.println("The Result is");
        int res=a-b;
        System.out.println(res);
 
     }

}
public class intfs1 {
    public static void main(String[] args) {
        MyCalc1 cal1=new MyCalc1();
        cal1.add();
        cal1.sub();

        MyCalc2 cal2=new MyCalc2();
        cal2.add();
        cal2.sub();

    }
    
}
