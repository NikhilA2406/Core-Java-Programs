import java.util.Scanner;

public class LaunchAdvancePattern5 
{
     public static void zerone_triangle(int r){
        for(int i =1; i<r;i++){
            for(int j=1; j<=i;j++){
                if((i+j)%2==0){
                    System.out.print("1");
                }
                else{
                    System.out.print("0");
                }
            }  
            System.out.println();
        }
    }
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int a=sc.nextInt();
            zerone_triangle(a);
        }
    } 
    
}
