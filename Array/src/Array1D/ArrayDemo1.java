package Array1D;

import java.util.Scanner;

public class ArrayDemo1 
{
    public static void main(String[] args) {
        int[] num = new int[5];
        try (Scanner sc = new Scanner(System.in)) {
            for(int i=0;i<num.length;i++){
                num[i]=sc.nextInt();
            }
        }
        for(int i=0;i<num.length;i++){
            System.out.print(num[i]);
        }

    }
    // public static void main(String[] args) {
    //          int[] num = new int[5];
    //          num[0]=1;
    //          num[1]=2;
    //          num[2]=3;
    //          num[3]=4;
    //          num[4]=5;
    //          for(int i=0;i<num.length;i++){
    //              System.out.print(num[i]);
    //         }
    // }
        // public static void main(String[] args) {
        //     int[] num=new int[5];
        //     Scanner sc=new Scanner(System.in);
        //     num[0]=sc.nextInt();
        //     num[1]=sc.nextInt();
        //     num[2]=sc.nextInt();
        //     System.out.println("Physics"+num[0]);
        //     System.out.println("Chemistry"+num[1]);
        //     System.out.println("Maths"+num[2]);
        //     num[2]=num[2]+1;
        //     System.out.println(num[2]);
        //     int percentage=(num[0]+num[1]+num[2])/3;
        //     System.out.println("Total Percentage"+percentage+"%");            
        // }
//     public static void update(int num[],int change){
//         change=15;
//         for(int i=0;i<num.length;i++){
//             num[i]=num[i]+1;
//         }
//     }     
//     public static void main(String[] args) {
//         int[] mark ={96,97,98};
//         int unchange=10;
//         update(mark,unchange);
//         System.out.println(unchange);
//         for(int i=0;i<mark.length;i++){
//         System.out.println(mark[i]);
//         }

//     }
    
}
