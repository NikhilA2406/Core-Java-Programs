package Array1D;

public class MaxSubArray {
    public static void printmaxsubarray(int number[]){
        int sa=0, currsum=0, maxsum=Integer.MIN_VALUE;
        for(int i=0;i<number.length;i++){
            for(int j=i;j<number.length;j++){
                currsum=0;
                for(int k=i;k<=j;k++){    
                 currsum+=number[k]; 
                }
                System.out.print(currsum+" ");
                if(maxsum<currsum)maxsum=currsum;
                sa++;
            }
            System.out.println();
        }
        System.out.println("Total Sub Arrays are "+sa);
        System.out.println("Max Sum "+maxsum);//Time Complexity of this fuction is big O(n^3)
    }
    public static void printmaxsubarray1(int number[]){
        int currsum=0, maxsum=Integer.MIN_VALUE;
        //Prefix array declaration
        int prefix[]=new int[number.length];
        prefix[0]=number[0];
        //calculate prefix Array
        for(int i=1;i<prefix.length;i++){
            prefix[i]=prefix[i-1]+number[i];
        }
        for(int i=0;i<number.length;i++){
            for(int j=i;j<number.length;j++){
                currsum=0;
                //Cacluating the prefix array & finding the maximum sum of the array
                currsum = i==0 ? prefix[j] : prefix[j]-prefix[i-1];
                System.out.print(currsum+" ");
                if(maxsum<currsum)maxsum=currsum;
            }
            System.out.println();
        }
        System.out.println("Max Sum "+maxsum);//Time Complexity of this fuction is big O(n^2)
    }
    public static void kadanes(int number[]){
         int ms=Integer.MIN_VALUE;
         int cs=0;
        for(int i =0;i<number.length;i++){
            cs=cs+number[i];
            if(cs<0)cs=0;
            ms=Math.max(cs,ms);
        }
        System.out.println("Our Max Sub Array sum is "+ms);
    }    
    public static void kadanes1(int number[]){
        int ms=Integer.MIN_VALUE;
       for(int i =0;i<number.length;i++){
  
           ms=Math.max(number[i],ms);
       }
       System.out.println("Our Max Sub Array sum is "+ms);
   }    
    public static void main(String[] args) {
        //int num[]={1,-2,6,-1,3};
        //int num[]={2,4,6,8,10};
        //int num[]={-2,-3,4,-1,-2,1,5,-3};
        int num[]={-2,-3,-4,-1,-2,-1,-5,-3};
        // printmaxsubarray(num);
        // printmaxsubarray1(num);
        //kadanes(num);
        kadanes1(num);
    }
    
    
}
