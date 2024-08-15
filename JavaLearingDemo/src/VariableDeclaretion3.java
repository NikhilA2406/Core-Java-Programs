import java.util.*;
public class VariableDeclaretion3 
{
    public static void main(String arg[])
    {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter the rate of Pencil");
            float a = sc.nextFloat();
            System.out.println("Enter the rate of Pen");
            float b = sc.nextFloat();
            System.out.println("Enter the rate of Ereaser");
            float c = sc.nextFloat();
            float amount = (a+b+c);
            float GST = amount*(18/100f);
            float Amount = amount+GST;
            System.out.println("Pencil"+a);
            System.out.println("Pen"+b);
            System.out.println("Ereaser"+c);
            System.out.println("---------------------");
            System.out.println("Total "+amount);
            System.out.println("GST 18% "+GST);
            System.out.println("The total Amount is "+Amount);
        }

    }
    
}
