import java.util.Scanner;

public class LaunchPrimeNumber2 
{
    public static boolean Prime(int n){
        //corner case
        if(n==2)
        return true;
        for(int i = 2;i<=Math.sqrt(n);i++){
            if(n%i==0)
            return(false); 
        }
         return true;
    }
    public static void primerange(int n){
        for(int i= 2;i<=n;i++){
            if(Prime(i))
            System.out.print(i+" ");
        }
    }
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int a = sc.nextInt();
            primerange(a);
        }
    }
    
}
