import java.util.Scanner;

public class LaunchIF2 
{
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter the Number");
            int a = sc.nextInt();
            if(a%5 == 0){
                System.out.println("The Enter Number is Divisible by 5 The Number is "+a);
            }
            else{
                System.out.println("The Enter Number is Divisible by 5 The Number is "+a);
            }
        }
    } 
    
}
