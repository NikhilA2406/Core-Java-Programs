public class LaunchAdvancePattern8 
{
    public static void triangle(int n){
        for(int i=1;i<=n;i++){
            for(int k=1;k<=(n-i);k++){
            System.out.print(" ");
            }
            for(int j=1;j<=i;j++){   
            System.out.print("* ");
            /*for(int k=1;k<=1;){
                System.out.print(" ");
                break;
            }*/    
            } 
            System.out.println();  
        }
    }
    public static void main(String[] args) {
        int a=8;
        triangle(a);
    }
    
}
