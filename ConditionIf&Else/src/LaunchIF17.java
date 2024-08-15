import java.util.Scanner;

public class LaunchIF17 
{
    public static void main(String[] args) {
        System.out.println("Enter the year");
        try (Scanner sc = new Scanner(System.in)) {
            int a = sc.nextInt();
            if(a%4 == 0)
                System.out.println("The Entered year is Leap year"+a);
                else System.out.println("The Entered year is not a leap year");
        }
    }
    
}
