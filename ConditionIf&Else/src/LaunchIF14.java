import java.util.Scanner;

public class LaunchIF14 
{
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter the Coordinates");
            int a = sc.nextInt();
            int b = sc.nextInt();
            if(a == 0 && b == 0)System.out.println("Point lies on Origin");
            else if(a==0 && b>0)System.out.println("Point lies on X-axis");
            else if(a>0 && b==0)System.out.println("Point lies on Y-axis");
            else if(a<0 && b>0)System.out.println("Point lies on 2nd Quadrant");
            else if(a<0 && b<0)System.out.println("Point lies on 3rd Quadrant");
            else if(a>0 && b>0)System.out.println("Point lies on 4th Quadrant");
                else System.out.println("Point lies on 1st Quadrant");
        }
    }
    
}
