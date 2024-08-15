import java.util.Scanner;

public class LaunchIF15 
{
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter the Number");
            int a = sc.nextInt();
            System.out.println((a%2==0)?"Even":"Odd");
        }
    }
    
}
