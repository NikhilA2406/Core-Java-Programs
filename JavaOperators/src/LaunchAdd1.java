import java.util.*;

public class LaunchAdd1 
{  public static void main(String arg[])
    {   
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter the First Numbers");
            int a = sc.nextInt();
            System.out.println("Enter the second Numbers");
            int b = sc.nextInt();
            int c = a+b;
            System.out.println(c);
        }
   } 
}


