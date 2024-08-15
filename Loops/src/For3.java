import java.util.Scanner;
public class For3 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int n = sc.nextInt();
            for(int i = 1;i<=n;i++){
                System.out.println(i);
            }
        }
    }  
}
