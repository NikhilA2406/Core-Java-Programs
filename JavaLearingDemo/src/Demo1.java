public class demo 
{
 public static void main(String arg[])
 {
    //byte a = 125;
    //int b = 12; we cannot assign the integer value to byte it will show error
    //byte k = (byte) b; only with the help of type casting we can assign the integer value to byte
   // int b = 257;if we take the value more than the byte limit it will take mod with that no. 257%256 remainder 1(where 256 is the no. between -128 to 127 including 0 also)
    //byte k = (byte) b;
     //float d = 5.6f;
     //int c = (int) d;
    /*byte a=10;
    byte b=30;*/
    //byte result = a*b; it will show error because the value of result exceed the limit of byte.
    //int result = a*b; this concept is called type promotion 
    int a = 55;
    char b = (char)a;
    System.out.println(b);
 }
 
}
