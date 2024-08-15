public class LaunchAdvancePattern20 
{
    public static void cross( int n){
        for(int i=n;i>=1;i--){
            for(int j=1;j<=(n-i);j++){
                    System.out.print(" ");
                }
            System.out.print("*");
            for(int j=1;j<=(2*(i-1)-1);j++){
                    System.out.print(" ");
                }
            if(i!=1)System.out.print("*");
        System.out.println();
        }
        for(int i=2;i<=n;i++){
            for(int j=1;j<=(n-i);j++){
                System.out.print(" ");
            }
            System.out.print("*");
            for(int j=1;j<=(2*(i-1)-1);j++){
                System.out.print(" ");
            }
            if(i!=1)System.out.print("*");
        System.out.println();
        }
        /*for(int i =1;i<=n;i++){
            for(int j=1;j<=n;j++){
                if(i==j||i+j==n+1){
                    System.out.print("*"+" ");
                }
                else{
                    System.out.print(" "+" ");
                }
            }
            System.out.println();
        }*/
    }
    public static void main(String[] args) {
        int a=7;
        cross(a);
    }   
    
}
