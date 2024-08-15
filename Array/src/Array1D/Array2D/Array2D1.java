package Array1D.Array2D;

import java.util.Scanner;

public class Array2D1 {
    public static boolean search(int arr[][],int key){
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
                if(arr[i][j]==key){
                    System.out.println("The index of the key is ("+i+","+j+")");
                    return true;
                }
            }
        }
        System.out.println("Key Not found");
        return false;
    }
    public static void largestsmallest(int arr[][]){
        int largest=Integer.MIN_VALUE, smallest=Integer.MAX_VALUE;
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
                 largest=Math.max(largest, arr[i][j]);
                 smallest=Math.min(smallest, arr[i][j]);
                }
            }
        System.out.println("The Largest No. in the Matrix is"+largest);
        System.out.println("The Smallest No. in the Matrix is"+smallest);
    }
    public static void main(String[] args) {
        int matrix[][]=new int[3][3];
        try (Scanner sc = new Scanner(System.in)) {
            for(int i=0;i<matrix.length;i++){
                for(int j=0;j<matrix[0].length;j++){
                    matrix[i][j]=sc.nextInt();
                }
            }
        }
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
            System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
        // int num = 4;
        // search(matrix, num);
        largestsmallest(matrix);
    }
    
}
