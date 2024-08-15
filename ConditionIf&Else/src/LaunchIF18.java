import java.util.Scanner;

public class LaunchIF18 
{
    public static void main(String[] args) {
        System.out.println("Enter the sides of Triangle");
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter the 1st Side");
            int a = sc.nextInt();
            System.out.println("Enter the 2nd Side");
            int b = sc.nextInt();
            System.out.println("Enter the 3rd Side");
            int c = sc.nextInt();
            if(a==b && b==c)System.out.println("The Triangle is Equilateral");
                else if(a!=b && b==c)System.out.println("The Triangle is Isosceles");
                    else if(a==b && b!=c)System.out.println("The Triangle is Isosceles");
                        else System.out.println("The Triangle is Scalene");

        }
    }
    
}
