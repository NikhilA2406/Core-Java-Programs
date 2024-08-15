public class LaunchAdvancePattern17 
{
    public static void num(int n){
        for(int i=0;i<n;i++){
            for(int j=1;j<=(n-i);j++){
                System.out.print(j);
            }
            for(int j=1;j<=(2*i)-1;j++){
                System.out.print(" ");
            }
            for(int j=(n-i);j>=1;j--){
                if(j==n){
                    continue;
                }
                System.out.print(j);
              
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int a=4;
        num(a);
    }   
    
}
