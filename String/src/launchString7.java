public class launchString7 {
    public static void main(String[] args) {
        StringBuilder sb1=new StringBuilder("JAVA");

        StringBuilder sb2=new StringBuilder("JAVA");

        System.out.println(sb1==sb2);//false
        System.out.println(sb1.equals(sb2));//false
        System.out.println(sb1.compareTo(sb2));//0
    }   
}
