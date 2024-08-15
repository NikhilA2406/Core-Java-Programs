package Array1D.Sorting;
import java.util.*;
public class SelectionSorting {
    public static void selectionsort(int arr[]){
        for(int i=0;i<arr.length-1;i++){
            int minposition=i;
            for(int j=i+1;j<arr.length;j++){
                if(arr[minposition]>arr[j]) minposition=j;
            }
            int temp = arr[minposition];
            arr[minposition]=arr[i];
            arr[i]=temp;
        }
        System.out.println();
    }
    public static void printsort(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]);
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int num[]=new int[5];
        try (Scanner sc = new Scanner(System.in)) {
            for(int i=0;i<num.length;i++){
                num[i]=sc.nextInt();
            }
        }
        selectionsort(num);
        printsort(num);
    }
    
}
