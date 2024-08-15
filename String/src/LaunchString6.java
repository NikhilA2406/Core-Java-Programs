public class LaunchString6 {
    public static void main(String[] args) {
        // StringBuffer sb1=new StringBuffer();
        // System.out.println(sb1.capacity());//16

        // StringBuilder sb1=new StringBuilder();
        // System.out.println(sb1.capacity());//16
        // sb1.append("Sachine Tendulkar");//16
        // System.out.println(sb1.capacity());
        // sb1.append("INDIA");
        // System.out.println(sb1.capacity());//34--> old capacity*2+2-->16*2+2=34
        // sb1.append("He is the finest batsman in india");
        // System.out.println(sb1.capacity());

        StringBuilder sb3=new StringBuilder("JAVA");//Actual capacity + no. characters-->16+4=20
        System.out.println(sb3.capacity());
        sb3.trimToSize();
        System.out.println(sb3.capacity());
        sb3.deleteCharAt(3);
        System.out.println(sb3);
        System.out.println(sb3.reverse());

        

    }
}
