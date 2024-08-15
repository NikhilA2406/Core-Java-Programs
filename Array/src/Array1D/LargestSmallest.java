package Array1D;
//import java.util.*;
public class LargestSmallest {
    public static int getlargest(int num[]){
        int largest=Integer.MIN_VALUE;//-infinity
        for(int i=0;i<num.length;i++){
            if(largest<num[i])largest=num[i];
        }
        return largest;
    }
    public static int getsmallest(int num[]){
        int smallest=Integer.MAX_VALUE;//+infinity
        for(int i=0;i<num.length;i++){
            if(smallest>num[i])smallest=num[i];
        }
        return smallest;
    }
    public static void main(String[] args) {
        int[] number={1,2,6,3,8};
        System.out.println("The Largest Number is ="+getlargest(number));
        System.out.println("The Smallest Number is ="+getsmallest(number));
    }
    
}
