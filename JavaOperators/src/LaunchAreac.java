import java.util.*;
public class LaunchAreac 
{
    public static void main(String arg[])
    {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter the Radius");
            float r = sc.nextFloat();
            float area = 3.14f*r*r;
            System.out.println(area);
        }
    }
    
}
