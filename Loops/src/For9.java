import java.util.Scanner;
public class For9 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int a = sc.nextInt();
            for(int i=1;i<=a;i++){
                System.out.println("*****");
            }
        }
    }    
}
