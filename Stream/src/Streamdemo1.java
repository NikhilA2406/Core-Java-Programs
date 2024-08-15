import java.util.List;
import java.util.Optional;
import java.util.function.Consumer;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Streamdemo1 
{
    public static void main(String[] args) {
        List<String> names=List.of("Sarah", "John", "Samantha", "Michael", "Steve", "Anna", "David", "Sophia", "James", "Sandra");

        // List<String> nameWithS=names.stream()
        //                 .filter(name->name.startsWith("S"))
        //                 .collect(Collectors.toList());
        // System.out.println(nameWithS);

        // String name1=names.stream()
        //                 .filter(name->name.startsWith("Z"))
        //                 .findFirst().orElse("Dummy");
        // System.out.println(name1);
        // System.out.println(name1.length());
        // for(String s:names){
        //     System.out.println(s);
        // }

        // Consumer<String> cu=new Consumer<String>() {

        //     @Override
        //     public void accept(String t) {
        //         System.out.println(t);
        //     }
            
        // };

        // Consumer<String> cu=t->System.out.println(t);
            
        // names.forEach(t->System.out.println(t));

        List<String> names1=List.of("Canada","Brazil","Japan","Germany","Australia ","South Africa");

        names1.stream()
                                .filter(n->n.length()<5)
                                .forEach(n->System.out.println(n));
                                                             
        
    }
    
}
