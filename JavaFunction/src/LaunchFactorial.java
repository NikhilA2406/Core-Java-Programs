import java.util.Scanner;

public class LaunchFactorial 
{
     public static int factorial(int n){
        int f=1;
        for(int i=1;i<=n;i++){
            f*=i;
        }
        return(f);
    }
     public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int a = sc.nextInt();
            int fact=factorial(a);
            System.out.println(fact);
        }
     }  
}
