package Array1D;

public class SubArray {
    public static void printsubarray(int number[]){
        int sa=0;
        for(int i=0;i<number.length;i++){
            for(int j=i;j<number.length;j++){
                System.out.print("[");
                for(int k=i;k<=j;k++){    
                System.out.print(number[k]);
                }
                System.out.print("] ");
                sa++;
            }
            System.out.println();
        }
        System.out.println("Total Sub Arrays are "+sa);
    }
    public static void main(String[] args) {
        int num[]={2,4,6,8,10};
        printsubarray(num);
    }
    
}
