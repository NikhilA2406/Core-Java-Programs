package Array1D.Sorting;
import java.util.*;
public class BubbleSorting {
    public static void bubblesort(int arr[]){
       for(int turn=0;turn<arr.length-1;turn++){
        for(int j=0;j<arr.length-1-turn;j++){
            if(arr[j]>arr[j+1]){
                //Swap
                int temp = arr[j];
                arr[j] = arr[j+1];
                arr[j+1] = temp;
            }
        }
       } 
    }
    //if array is already sorted
    public static void bubblesort1(int arr[]){
        int swap=0;
        for(int turn=0;turn<arr.length-1;turn++){
            
            for(int j=0;j<arr.length-1-turn;j++){
                if(arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                    swap++;
                }   
            }
        }
        if(swap==0)System.out.println("The array is already Sorted");
    }
    //Printing Sorted Array
    public static void printsort(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) { 
        int[] num = new int[5];
            try (Scanner sc = new Scanner(System.in)) {
                for(int i=0;i<num.length;i++){
                    num[i]=sc.nextInt();
                }
            }
            bubblesort1(num);
        printsort(num);  
    }  
}
