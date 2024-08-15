import java.util.Scanner;

public class LaunchAdvancePattern2 
{
    public static void inverted_rotpyd(int r){
        for(int i =1; i<=r;i++){
            for(int j=1; j<=r-i;j++){
                System.out.print(" ");
            }
            for(int k=1;k<=i;k++){
                System.out.print("*");
            }   
            System.out.println();
        }
    }
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int a=sc.nextInt();
            inverted_rotpyd(a);
        }
    }   
    
}
