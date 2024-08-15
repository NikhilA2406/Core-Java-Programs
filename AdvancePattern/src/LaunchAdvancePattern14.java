public class LaunchAdvancePattern14 
{
    public static void triangle(int n){
        for (int i = 1; i <= n; i++) { 
             for (int k = 1; k <= n - i; k++) { // printing left spaces 
                 System.out.print(" "); 
             } 
  
             System.out.print(i); // print the left element 
  
             for (int spaces = 0; spaces < 2 * (i - 1) - 1; spaces++) { // printing middle spaces 
                 System.out.print(" "); 
             } 
  
             if (i != 1) System.out.print(i); // printing the right element 
             System.out.println(); 
         }
     }
     public static void main(String[] args) {
         int a=8;
         triangle(a);
     }
    
}
