//import java.util.*;
public class Launch_String {
    public static void printchar(String Str){
        for(int i=0;i<Str.length();i++){
            System.out.print(Str.charAt(i)+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        // char[] arr={'a','b','c','d'};
        // String str="abcd";
        // String str2=new String("xyz");
        // System.out.println(arr);
        // System.out.println(str);
        // System.out.println(str2);
        //Take String as an Input
        //Scanner sc = new Scanner(System.in);
        //String str =sc.next();
        // System.out.println(str);
        //Take more than one String or an sentenses as an Input
        // Scanner sc = new Scanner(System.in);
        // String str =sc.nextLine();//nextLine() is use to print whole sentense
        // System.out.println(str);
        //Length of the string
        //System.out.println(str.length());
        //Concatenation (Joining two or More string)
        String firstname = "Nikhil";
        String Lastname = "Jaiswal";
        String fullname =firstname+" "+Lastname;
        // System.out.println(fullname);
        //chatAt() (This function is use to print the particular characte of the string)
        printchar(fullname);
    }
    
}
