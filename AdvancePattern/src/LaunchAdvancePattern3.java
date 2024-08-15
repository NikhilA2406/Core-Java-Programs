import java.util.Scanner;

public class LaunchAdvancePattern3 
{
    public static void inverted_halfpydnum(int r){
        for(int i =0; i<r;i++){
            for(int j=1; j<=r-i;j++){
                System.out.print(j);
            }  
            System.out.println();
        }
    }
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int a=sc.nextInt();
            inverted_halfpydnum(a);
        }
    }
}
