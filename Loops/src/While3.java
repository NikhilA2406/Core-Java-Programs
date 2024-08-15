import java.util.*;
public class While3 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int count=0;
            int n = sc.nextInt();
            while(n!=0){
                n=n/10;
                count++;                
            }
            System.out.println(count);
        }
    }    
}
