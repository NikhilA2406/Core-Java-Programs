package Array1D.Array2D;

public class DiagonalSum {
    public static void printdiagonalsum(int arr[][]){
        int primary =0, secondary=0, n=arr.length;
        // for(int i=0;i<n;i++){
        //     for(int j=0;j<arr[0].length;j++){
        //         if(i==j) primary=primary+arr[i][j];
        //         if(i+j==n-1) secondary=secondary+arr[i][j]; 
        //     }
        // } //Time complexity for this code is big O of n^2
        for(int i=0;i<n;i++){
            primary+=arr[i][i];
            if(i!=n-1-i)secondary+=arr[i][n-1-i];//i+j=n-1 => j=n-1-i
        }//Time complexity for this code is big O of n
        System.out.println("The sum of Primary & Secondary Diagonal is "+(primary+secondary));
    }
    public static void main(String[] args) {
        int matrix[][]={{1,2,3,4},
                          {5,6,7,8},
                          {9,10,11,12},
                          {13,14,15,16}};
        printdiagonalsum(matrix);
    
    }
}
    

