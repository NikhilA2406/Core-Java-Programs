public class LaunchBinaryToDecimal 
{
    public static void binaryToDecimal( int n){
        int count = 0;
        int dec = 0;
        while(n > 0){
            int a = n%10;
            dec = dec + a*(int)Math.pow(2, count);
            n = n/10; 
            count++;
        }
        System.out.println(dec);
    }
    public static void main(String[] args) {
        binaryToDecimal(100);
    }
    
}
