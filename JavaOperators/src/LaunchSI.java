import java.util.*;

public class LaunchSI {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter the principal amount");
            int p = sc.nextInt();
            System.out.println("Enter the Interest");
            float r = sc.nextFloat();
            System.out.println("Enter the Time Period in Year");
            int t = sc.nextInt();
            float si = (p*r*t)/100f;
            System.out.println("The SI is "+si);
        }
        

    }
}
