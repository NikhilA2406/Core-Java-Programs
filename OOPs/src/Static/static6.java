package Static;

import java.util.Scanner;

class Framer
{
    float pa;
    float td;
    float si;

    static float ri;

    static{
        ri=2.5f;
    }
    void input()
    {
        Scanner sc=new Scanner(System.in);
        
        System.out.println("Please enter the loan amount ");
        pa=sc.nextFloat();

        System.out.println("Please enter the time duration ");
        td=sc.nextFloat();

    }
    void compute()
    {
        si=pa*td*ri/100.0f;
    }
    void disp()
    {
        System.out.println("The SI is :"+si);
    }
}

public class static6 {
    public static void main(String[] args) {
        System.out.println("Farmer 1");
        Framer f1=new Framer();
        f1.input();
        f1.compute();
        f1.disp();
        System.out.println("***********************************");
        System.out.println("Farmer 2");
        Framer f2=new Framer();
        f2.input();
        f2.compute();
        f2.disp();
        System.out.println("***********************************");
        System.out.println("Farmer 3");
        Framer f3=new Framer();
        f3.input();
        f3.compute();
        f3.disp();
    }
    
}
