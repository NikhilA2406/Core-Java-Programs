import java.util.Scanner;
public class For6 {
    public static void main(String[] args) {
      try (Scanner sc = new Scanner(System.in)) {
         int n = sc.nextInt();
            int a = 0;
            for(int i = 0;i<=n;i++){
               a = a + i;
            }
            System.out.println(a);
      }
   }    
}
