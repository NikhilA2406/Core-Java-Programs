import java.util.Scanner;

public class ForGP{
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int n = sc.nextInt();
            // 1,2,2,4,16,32.....
            int a=1;
            for(int i = 1;i<=n;i++){
                a=a*2;
                System.out.println(a);
            }
        }
    }    
}
