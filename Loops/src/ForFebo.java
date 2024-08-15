import java.util.*;
public class ForFebo {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter the No. of Term");
            int n = sc.nextInt();
            int a = 0, b=1,c;
            System.out.println(a);
            System.out.println(b);
            for(int i = 0;i<=n;i++){
                
                c=a+b;
                System.out.println(c);
                a=b;
                b=c;
            }
        }
    }    
}
