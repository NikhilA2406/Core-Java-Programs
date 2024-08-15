package Array1D;

public class RainWaterTrapped {
    public static int sum(int number[]){
        int n = number.length;
        //Calculate the Left max boundry - Array
        int leftmax[]=new int[n];
        leftmax[0] = number[0];
        for(int i=1;i<n;i++){
            leftmax[i]=Math.max(number[i],leftmax[i-1]);
            //System.out.println(leftmax[i]);
        }
        //Calculate the Right max boundry - Array
        int rightmax[]=new int[n];
        rightmax[n-1] = number[n-1];
        for(int i=n-2;i>=0;i--){
            rightmax[i]=Math.max(number[i],rightmax[i+1]);
            //System.out.println(rightmax[i]);
        }
        int trappedwater=0;
        //loop
        for(int i=0;i<n;i++){
            //waterlevel of min(leftmaxbound, rightmaxbound)
            int waterlevel =Math.min(leftmax[i], rightmax[i]);
            //trappedwater=waterlevel-number[i]
            trappedwater+= waterlevel-number[i];
        }
        return trappedwater;
        
    }
    public static void main(String[] args) {
        int height[]={4,2,0,6,3,2,5};
        System.out.println(sum(height));
    }
    
}
