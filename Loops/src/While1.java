public class While1 {
    public static void main(String[] args) {
        int a = 121;
    
        while(a > 0){
            int n = a%10;
            a = a/10;
            System.out.print(n); 
        }
    }
}
