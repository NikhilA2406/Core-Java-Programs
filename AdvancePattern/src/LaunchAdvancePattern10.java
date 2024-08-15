public class LaunchAdvancePattern10 
{
    public static void rom(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=(n-i);j++){
                System.out.print(" ");
            }
            for(int j=1;j<=n;j++){
                if(j==1||j==n||i==1||i==n){
                System.out.print("*");
                }
                else{
                System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int a = 10;
        rom(a);
    }   
    
}
