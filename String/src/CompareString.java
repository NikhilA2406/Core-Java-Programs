public class CompareString {
    public static void main(String[] args) {
        String S1 = "tony";
        String S2 = "tony";
        String S3=new String("tony");
        if(S1==S2){
            System.out.println("Strings are equal");
        }
        else{
            System.out.println("Strins are not equal");

        }
        // if(S1==S3){
        //     System.out.println("Strings are equal");
        // }
        // else{
        //     System.out.println("Strins are not equal");
            
        // }
        if(S1.equals(S3)){
            System.out.println("Strings are equal");
        }
        else{
            System.out.println("Strins are not equal");
        }
    
}
}