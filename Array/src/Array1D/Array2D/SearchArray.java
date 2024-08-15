package Array1D.Array2D;

public class SearchArray {
    public static boolean staircasesearch1(int arr[][],int key){
    int row=0, col=arr[0].length-1;
    while(row<arr.length&&col>=0){
        if(arr[row][col]==key){
            System.out.print("The key is found ("+row+","+col+")");
            return true;
        }else if(key<arr[row][col]){
            col--;
        }else row++;
    }
    System.out.print("Key Not Found");
    return false;
}
public static boolean staircasesearch2(int arr[][],int key){
    int row=arr.length-1, col=0;
    while(row >= 0 && col<arr[0].length){
        if(arr[row][col]==key){ 
        System.out.println("The key is found ("+row+","+col+")");
        return true;
        }
        else if(key<arr[row][col]){
            row--;
        }
        else{
            col++;
        }
    }
    System.out.print("Not found");
    return false;    
}
        public static void main(String[] args) {
        int matrix[][]={{10,20,30,40},
                          {15,25,35,45},
                          {27,29,37,48},
                          {32,33,39,50}};
        int key =40;
        staircasesearch2(matrix, key);
    }
    
}
