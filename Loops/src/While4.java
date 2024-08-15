public class While4 {
    public static void main(String[] args) {
        int num = 121,temp;
        int rev = 0;
        temp=num;
        while(num > 0){
          int n = num%10;
            rev = (rev*10)+n;
            num = num/10; 
        } 
        if(temp==rev){
        System.out.println("The Entered Number is Palindrome"+rev);
        }
        else{
            System.out.println("The Entered Number is Not a Palindrome"+rev);
        }
    }    
    
}
