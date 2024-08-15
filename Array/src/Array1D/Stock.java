package Array1D;

public class Stock {
    public static int buysellstock(int rate[]){
        int buyprice=Integer.MAX_VALUE, maxprofit=0;
        for(int i = 0;i<rate.length;i++){
            if(buyprice<rate[i]){
                int profit=rate[i]-buyprice;
                System.out.print(profit+" ");
                maxprofit=Math.max(maxprofit, profit);
               }else{
                buyprice=rate[i];
               }
            }
            System.out.println();
        return maxprofit;
    }
    public static void main(String[] args) {
        int price[]={7,1,5,3,6,4};
        System.out.println(buysellstock(price));
    }
    
}
