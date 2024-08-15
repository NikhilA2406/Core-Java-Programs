import java.util.Scanner;

public class LaunchIF5 
{
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter the Length");
            int l = sc.nextInt();
            System.out.println("Enter the Width");
            int w = sc.nextInt();
            int area = l * w;
            int pmtr = 2*(l + w);
            if(area>pmtr){
                System.out.println("The area is greater The area is "+area);
            }
            else{
                System.out.println("The perimeter is greater The perimeter is "+pmtr);
            }
        }
    }   
    
}
