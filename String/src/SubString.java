public class SubString {
    public static String substring(String str, int si, int ei){
        String substrings=" ";
        for(int i=si;i<ei;i++){
            substrings+=str.charAt(i);
        }
        return substrings;
    }
    public static void main(String[] args) {
        String str ="Hello World";
        //System.out.println(substring(str,0,5));
        System.out.println(str.substring(0, 5));
    }
    
}
