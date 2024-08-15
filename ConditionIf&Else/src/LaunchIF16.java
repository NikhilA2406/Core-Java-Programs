import java.util.Scanner;

public class LaunchIF16 
{
    public static int fasb(int num) {
        if (num < 0) {
            return -num;
        } else {
            return num;
        }
    }
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int a = sc.nextInt();
            int absoluteValue = fasb(a);
            System.out.println("The absolute value of " + a + " is: " + absoluteValue);
        }
    }
    
}
