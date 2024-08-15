import java.util.Scanner;

public class LaunchSwapNumbers 
{
    public static void change( int a, int b){
        int temp = b;
        b = a;
        a = temp;
        System.out.println(a);
        System.out.println(b);
    }
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int c = sc.nextInt();
            int d = sc.nextInt();
            change(c,d);
        }
    }
}
