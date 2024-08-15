import java.util.*;
public class forgcd {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int m = sc.nextInt();
            int n = sc.nextInt();
            int gcd = 1;
            for(int i=1;i<=m&&i<=n;i++){
                if(n%i == 0 && m%i == 0)
                gcd = i;
            }
            System.out.println("The GCD is "+gcd);
        }
    }    
}
