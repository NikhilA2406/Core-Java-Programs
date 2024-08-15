package Array1D;

public class PairArray {
    public static void pair(int number[]){
        int tp=0;
        for(int i=0;i<number.length;i++){
            for(int j=i+1;j<number.length;j++){
                System.out.print("("+number[i]+","+number[j]+")"+" ");
                tp++;
            }
            System.out.println();
        }
        System.out.println("Total Pairs of the Arrya is "+tp);
    }
    public static void main(String[] args) {
        int num[]={2,4,6,8,10};
        pair(num);
    }
    
}
