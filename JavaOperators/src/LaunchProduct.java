import java.util.*;
public class LaunchProduct 
{
    public static void main(String arg[])
    {
        try (Scanner sc = new Scanner (System.in)) {
            System.out.println("Enter the Numbers");
            int a = sc.nextInt();
            int b = sc.nextInt();
            int result = a*b;
            System.out.println(result);
        }
        
    }
    
}
