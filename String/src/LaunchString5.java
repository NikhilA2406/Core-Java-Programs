public class LaunchString5 
{
    public static void main(String[] args) {
        //Mutable String --> StringBuilder -->StringBuffer
        //StringBuffer sb="Telusko";//invalid
        StringBuffer sb1=new StringBuffer("Telusko");
        System.out.println(sb1);

        StringBuilder sb2=new StringBuilder("Telusko");
        System.out.println(sb2);

        // StringBuffer sb3=new StringBuffer();
        // sb3.append("Nikhil");
        // System.out.println(sb3);
        // sb3.append(" Anjali");
        // System.out.println(sb3);

        StringBuilder sb3=new StringBuilder();
        sb3.append("Nikhil");
        System.out.println(sb3);
        sb3.append(" Anjali");
        System.out.println(sb3);
        sb3.append(10);
        System.out.println(sb3);

    }
    
}
