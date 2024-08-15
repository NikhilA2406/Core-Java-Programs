import java.util.*;
public class ForAP1 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int n = sc.nextInt();
            // 1,3,5,7......
            /*for(int i = 1;i<=2*n-1;i+=2){
                System.out.println(i);
            }*/
            int a=1;
            for(int i =1;i<=n;i++){
                
                System.out.println(a);
                a=a+2;
            }
        }
    }    
}
