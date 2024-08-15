import java.util.Scanner;

public class LaunchBinaryCoefficient 
{
    public static int factorial(int n){
    int N=1;
        for(int i =1;i<=n;i++) N*=i;
        return(N);
    }
    public static int coefficient(int n, int r){
        /*int N=1, R=1, F=1;
        for(int i =1;i<=n;i++) N*=i;
        for(int i =1;i<=r;i++) R*=i;
        for(int i =1;i<=n-r;i++) F*=i;*/
        int N = factorial(n);
        int R = factorial(r);
        int F = factorial(n-r);
        int bc = N/(R*F);
        return(bc);
    }
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            System.out.println(coefficient(a,b));

        }
    }
    
}
