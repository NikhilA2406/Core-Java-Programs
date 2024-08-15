import java.util.Scanner;

public class LaunchIF13 
{
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter the Marks from 0 to 100");
            int a = sc.nextInt();
            if(a>=81)System.out.println(a+" Veery Good");
            else if(a>=61) System.out.println(a+" Good");
            else if(a>=41)System.out.println(a+"Average");
                else
                    System.out.println(a+"fail");
        }
    }
    
}
