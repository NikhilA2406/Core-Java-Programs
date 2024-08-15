import java.util.Scanner;

public class LaunchIF12 
{
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter the age of Ram");
            int a = sc.nextInt();
            System.out.println("Enter the age of Shyam");
            int b = sc.nextInt();
            System.out.println("Enter the age of Ajay");
            int c = sc.nextInt();
            if(a<=b){
                if(a<=c){
                    System.out.println(a+" Ram is Youngest");
                    }
                    else{
                    System.out.println(c+" Ajay is Youngest");
                    }           
            }
            else{
                if(b<=c){
                    System.out.println(b+"Shyam is Youngest");
                }
                else{
                    System.out.println(c+"Ajay is Youngest");
                }
            }
        }
    }
    
}
