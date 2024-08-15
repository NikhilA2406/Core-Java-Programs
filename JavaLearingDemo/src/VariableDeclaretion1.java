import java.util.*;
public class VariableDeclaretion1 
{
    public static void main(String arg[])
    {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter the 1st No.");
            int a = sc.nextInt();
            System.out.println("Enter the 2nd No.");
            int b = sc.nextInt();
            System.out.println("Enter the 3rd No.");
            int c = sc.nextInt();
            float result = (a+b+c)/3f;
            System.out.println(result);
        }
    }
}
    