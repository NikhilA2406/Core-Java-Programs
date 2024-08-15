import java.util.Scanner;

public class LaunchIF7 
{
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter the Number");
            int a = sc.nextInt();
            if(a%5==0 || a%3==0){
                System.out.println("The Enter Number is Divisible by 3 or 5 The Number is "+a);
            }
            else{
                System.out.println("The Enter Number is Not Divisible by 3 or 5 The Number is "+a);
        }
        }   
    }
}