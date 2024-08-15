package Array1D;

public class ReverseArray {
    public static void reverse(int number[]){
        int first=0, last=number.length-1;
        while(first<last){  //reverse code
            int temp=number[last];
            number[last]=number[first];
            number[first]=temp;
            first++;
            last--;
        }
    }
    public static void main(String[] args) {
        int num[]={2,4,6,8,10};
        reverse(num);
            //print
            for(int i=0;i<num.length;i++){
                System.out.print(num[i]+" ");
            }
        System.out.println();
    }
}
