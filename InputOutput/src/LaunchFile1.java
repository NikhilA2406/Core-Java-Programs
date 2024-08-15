import java.io.File;
import java.io.IOException;

public class LaunchFile1 
{
    public static void main(String[] args) 
    {
        String Path1="E:\\IO\\FileHandling\\java.txt";
        String Path2="E:\\IO\\FileHandling\\NIKHIL";
        
        try 
        {
            File file1=new File(Path1);
        //    System.out.println(file1.createNewFile());//true--> If file is already present then it will not create any new file
            System.out.println(file1.exists());//false//true
            System.out.println(file1.isFile());//true
            System.out.println(file1.isDirectory());//False
            System.out.println(file1.getPath());//E:\IO\FileHandling\java.txt

            File direcotry1=new File(Path2);
            System.out.println(direcotry1.mkdir());//true
            System.out.println(direcotry1.isDirectory());//true
            System.out.println("*************************************************");

            File file2=new File("E:\\Wedding Photo\\New folder");
            String[] str=file2.list();
            int count =0;
            for(String files:str)
            {
                count++;
                System.out.println(files);
            }
            System.out.println("The no. of files in the specified path :"+count);
        } catch (Exception e) 
        {
            e.printStackTrace();
        }
        

        
    }
    
}
