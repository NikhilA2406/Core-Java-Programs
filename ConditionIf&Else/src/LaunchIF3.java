import java.util.Scanner;

public class LaunchIF3 
{
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter the Cost Price");
            int cp = sc.nextInt();
            System.out.println("Enter the Selling Price");
            int sp = sc.nextInt();
            if(cp>sp){
                System.out.println("The vegetable vender is in loss ");
                System.out.println("The loss amount is "+(cp-sp));   
            }
            else{
                System.out.println("The vegetable vender is in profit  ");
                System.out.println("The profit amount is "+(sp-cp));
            }
        
        }
    }    
    
}
