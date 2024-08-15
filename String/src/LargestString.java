public class LargestString {
    public static void printlargeststr(String str[]){
        String largest=str[0];//here assigning apple as the largest string.
        for(int i=1;i<str.length;i++){
            if((largest).compareTo(str[i])<0){//This function treat 'A' and 'a' as differently or unequal.
                largest=str[i];
            }
        }
        System.out.println(largest);
    }
    public static void printlargeststr1(String str[]){
        String largest=str[0];//here assigning apple as the largest string.
        for(int i=1;i<str.length;i++){
            if((largest).compareToIgnoreCase(str[i])<0){//This function treat 'A' and 'a' as same or equally.
                largest=str[i];
            }
        }
        System.out.println(largest);
    }
    public static void main(String[] args) {
        String fruit[]={"apple","mango","banana"};
        String fruits[]={"apple","Mango","banana"};
        printlargeststr(fruit);
        printlargeststr1(fruits);
    }
    
}
