import java.util.Scanner;

public class LaunchMultiply 
{
    public static int multi(int a, int b){
        int product=a*b;
        return product;
    }
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int c = sc.nextInt();
            int d = sc.nextInt();
            int prod = multi(c,d);
            System.out.println(prod);
        }
    }
}
