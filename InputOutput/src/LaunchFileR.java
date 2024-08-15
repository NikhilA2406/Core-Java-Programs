import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class LaunchFileR //File Read
{
    public static void main(String[] args) 
    {
        String Path1="E:\\IO\\FileHandling";
        FileReader fr=null;
        try 
        {
            //File file=new File(Path1);
            File dir=new File(Path1);
            File file=new File(dir,"java.txt");
            fr=new FileReader(file);
            // int i=fr.read();
            // while(i!=-1)
            // {
            //     System.out.println(i+"---->"+(char)i);
            //     i=fr.read();
            // }
            int size=(int)file.length();
            char ch[]=new char[size];
            fr.read(ch);

            for(char c:ch)
            {
                System.out.print(c);
            }
            
        } 
        catch (Exception e) 
        {
            System.out.println("Something went worng");
        }
        finally
        {
            try 
            {
                fr.close();
            } 
            catch (IOException e) {
                e.printStackTrace();
            }
        }    
        
    }
    
}
