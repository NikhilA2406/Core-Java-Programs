public class LaunchAdvancePattern13 
{
    public static void hollowtri(int n){
        for(int i =1;i<=n;i++){
            for(int j=1;j<=(n-i);j++){
                System.out.print(" ");
            }
            for(int j=1;j<=(2*i)-1;j++){
                if(i==1||j==1||i==n||j==(2*i)-1||j==i){
                System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
                
            }
            System.out.println();
        }
        for(int i=n-1;i>=1;i--){
            for(int j=1;j<=(n-i);j++){
                System.out.print(" ");
            }
            for(int j=1;j<=(2*i)-1;j++){
                if(i==1||j==1||i==n||j==(2*i)-1||j==i){
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
        int a=10;
        hollowtri(a);
    }
    
}
