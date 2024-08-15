package Array1D.Sorting;
import java.util.*;
public class InsertionSorting {
    public static void insertionsort(int arr[]){
        for(int i=1;i<arr.length;i++){
            int curr=arr[i];
            int prev=i-1;
            while(prev>=0&&arr[prev]>curr){
                arr[prev+1]=arr[prev];
                prev--;
                //Insertion
                arr[prev+1]=curr;
            }
        }
    }
    public static void printarray(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String[] args) {
        int num[]=new int[5];
        try (Scanner sc = new Scanner(System.in)) {
            for(int i=0;i<num.length;i++){
                num[i]=sc.nextInt();
            }
        }
        insertionsort(num);
        printarray(num);
    }
}
