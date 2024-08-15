public class LaunchAdvancePattern15 
{
    public static void hollowtri( int n){
        /*   *
            * *
           *   *
          *     *
         *       * To print this pattern below loop will use.*/
            for(int i=1;i<=n;i++){
                for(int j=1;j<=(n-i);j++){
                    System.out.print(" ");
                }
                System.out.print("*");
                for(int j=1;j<=(2*(i-1)-1);j++){
                    System.out.print(" ");
                }
                if(i!=1)System.out.print("*");
            System.out.println();
            }
    /**       *
       *     *
        *   *
         * *
          * To print this pattern below loop will use.
            for(int i=n;i>=1;i--){
                for(int j=1;j<=(n-i);j++){
                    System.out.print(" ");
                }
                System.out.print("*");
                for(int j=1;j<=(2*(i-1)-1);j++){
                    System.out.print(" ");
                }
                if(i!=1)System.out.print("*");
            System.out.println();
            }*/
            
        }
        public static void main(String[] args) {
            int a=10;
            hollowtri(a);
        }
    
}
