public class LaunchAdvancePattern19 
{
    public static void alpabettri(int n){
        
        for(int i=1;i<=n;i++){
            for(int j=1;j<=(n-i);j++){
                System.out.print(" ");
                
            }
            for(int j=1;j<=(2*i)-1;j++){
                System.out.print((char)(j+64));
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int a=10;
        alpabettri(a);
    }       
    
}
