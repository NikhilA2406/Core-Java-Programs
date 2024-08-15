import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class Streamdemo 
{
    public static void main(String[] args) 
    {
        List<Integer> nums= Arrays.asList(5,8,3,9,2,6,1);

        //pick odd numbers, double it, and sum it.

        int sum =0;
        //Predicate is a intrface & here we are working concept of anonymous
        // Predicate<Integer> predicate=new Predicate<Integer>() {

        //     @Override
        //     public boolean test(Integer t) {
        //         //System.out.println("i am here");lenght of stream1 which is 7
        //         return t%2 !=0;
        //     }
            
        // };
        // Function<Integer,Integer> function= new Function<Integer,Integer>() {

        //     @Override
        //     public Integer apply(Integer t) {
        //         System.out.println("i am here");//lenght of stream2 which is 4
        //         return t*2;
        //     }
            
        // };
        // BinaryOperator<Integer> op=new BinaryOperator<Integer>() {

        //     @Override
        //     public Integer apply(Integer c, Integer e) {
        //         return c+e;
        //     }
            
        // };
        Predicate<Integer> predicate=n -> n%2!=0;
        Function<Integer,Integer> function=t-> t*2;
        BinaryOperator<Integer> op=(c,e)-> c+e;
            

        Stream<Integer> stream1=nums.stream();
        // Stream<Integer> stream2=stream1.filter(n -> n%2 !=0);
        Stream<Integer> stream2=stream1.filter(predicate);//Intermediate
        Stream<Integer> stream3=stream2.map(function);//Intermediate
        int result=stream3.reduce(0, op);//Terminal

        System.out.println(result);
        //System.out.println(stream1.toList());
        //System.out.println(stream1.count());//when you create the object for the stream i will only use once for operation
        
        
        // for(int i=0;i<nums.size();i++)
        // {
        //     if(nums.get(i)%2 !=0 )
        //     {
        //         int dou=nums.get(i)*2;
        //         sum=sum+dou;
        //     }
        // }

        int sum1 =nums.stream()
                .filter(n -> n%2 !=0)
                .map(n-> n*2)
                .reduce(0, (c,e) -> c+e);
        // System.out.println(sum1);
        // System.out.println("Result "+sum);
        // System.out.println(nums);
    }
    
}
