package Array1D;

public class BinarySearch {
    
    public static int search(int num[], int value){
        int start=0, end=num.length-1;
        while(start<=end){
            int mid = (start+end)/2;
            if(num[mid]==value)return mid;
            //Comparisons
            if(num[mid]>value){
                end=mid-1;
            }else{
                start=mid+1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] number={2,4,6,8,10,12,16};
        int key=10;
        System.out.println("The Index of the given Key is = "+search(number,key));
    }
}
