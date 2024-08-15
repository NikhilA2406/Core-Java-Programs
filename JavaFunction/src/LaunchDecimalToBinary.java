public class LaunchDecimalToBinary 
{
    public static void decimalToBinary( int n){
        int count = 0;
        int dec = 0;
        while(n > 0){
            int a = n%2;
            dec = dec + a*(int)Math.pow(10, count);
            count++;
            n/=2;
        }
        System.out.println(dec);
    }
    public static void main(String[] args) {
        decimalToBinary(5);
    }
    
}
