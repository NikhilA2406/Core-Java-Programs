import java.util.*;
public class VariableDeclaretion2 
{
    public static void main(String arg[])
    {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter the lenght");
            int s = sc.nextInt();
            int area = s*s;
            System.out.println("The area of square is "+area);
        }
    }
    
}
