import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class LaunchBRFR //Buffer Reader File Reader
{
    public static void main(String[] args) 
    {
        String Path1="E:\\IO\\FileHandling";
        FileReader fr=null;
        BufferedReader br=null;
        try 
        {
            //File file=new File(Path1);
            File dir=new File(Path1);
            File file=new File(dir,"java.txt");
            fr=new FileReader(file);
            br=new BufferedReader(fr);
            String str =br.readLine();
            while(str!=null)
            {
                System.out.println(str);
                str=br.readLine();
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
                br.close();
            } 
            catch (IOException e) {
                e.printStackTrace();
            }
        }    
        
    }
    
}
