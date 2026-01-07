import java.util.Arrays;
import java.util.stream.Stream;
import java.util.*;
public class stream {
    public static void main(String args[]){
        List <Integer> nums = Arrays.asList(4,7,5,3,6,9);
        Stream<Integer> s1 = nums.stream();
        Stream<Integer> s2 = s1.filter(n->n%2==0);
        Stream<Integer> s3 = s2.map(n->n*2);
        int result = s3.reduce(0,(c,e)->c+e);
        System.out.println(result);
    }
}
