import java.util.Scanner;

public class ForAP2 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int n = sc.nextInt();
            // 4,7,10,13,16......
            /*for(int i = 1;i<=3*n+1;i+=3){
                System.out.println(i);
            }*/
            int a = 1;
            for(int i = 1;i<=n;i++){
                a=a+3;
                System.out.println(a);
            }
        }
    }    
}
