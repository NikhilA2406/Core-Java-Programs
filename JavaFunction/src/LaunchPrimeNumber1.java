import java.util.Scanner;

public class LaunchPrimeNumber1 
{
    /*public static boolean Prime(int n){
        boolean Prime = true;
        for(int i = 2;i<=(n-1);i++){
            if(n%i==0) 
            Prime = false;
        }
        return(Prime);  
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        System.out.println(Prime(a));
    }*/
    /*public static boolean Prime(int n){
        //corner case
        if(n==2)
        return true;
        for(int i = 2;i<=(n-1);i++){
            if(n%i==0)
            return(false); 
        }
         return true;
    }*/
    public static boolean Prime(int n){
        //corner case
        if(n==2)
        return true;
        for(int i = 2;i<=Math.sqrt(n);i++){
            if(n%i==0)
            return(false); 
        }
         return true;
    }
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int a = sc.nextInt();
            System.out.println(Prime(a));
        }
    }
    
}
