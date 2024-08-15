import java.util.Scanner;

public class LaunchFunctionAdd 
{
    public static int sum(int a,int b){
        int SUM = a+b;
        return SUM;
    }
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int c = sc.nextInt();
            int d = sc.nextInt();
            int Sum = sum(c,d);
            System.out.println(Sum);
        }
    }
}
