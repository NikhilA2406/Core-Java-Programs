import java.util.Scanner;

public class Pattern5 {
    public static void main(String[] args) {
        char ch ='A';
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter the No. of lines");
            int l = sc.nextInt();
            for(int i=1;i<=l;i++){
                for(int j=1;j<=i;j++){
                    System.out.print(ch);
                    ch++;
                }
                System.out.println();
            }
        }
    }    
}
