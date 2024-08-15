package Array1D;

public class LinearSearch {
    public static int search(int number[],int find){
        for(int i=0;i<number.length;i++){
            if(number[i]==find){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] num={2,4,6,8,10,12,16};
        int key=10;
        int index=search(num,key);
        if(index==-1){
            System.out.println("Not Found");
        }else{
            System.out.println("The index of Your Element is "+index);
        }
        
    }
    
}
