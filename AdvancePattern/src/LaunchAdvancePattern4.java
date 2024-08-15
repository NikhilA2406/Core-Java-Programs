import java.util.Scanner;

public class LaunchAdvancePattern4 
{
    public static void floyd_triangle(int r){
        int num = 1;
        for(int i =1; i<=r;i++){
            for(int j=1; j<=i;j++){
                System.out.print(num+" ");
                num++;
                }  
            System.out.println();
        }
    }
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int a=sc.nextInt();
            floyd_triangle(a);
        }
    }     
    
}
