import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class sorting {
    public static void main(String args[]){
        Comparator<Integer> com = (i,j)->(i%10>j%10)?1:-1;
        List<Integer>  nums = new ArrayList<>();
        nums.add(65);
        nums.add(78);
        nums.add(91);
        nums.add(56);
        Collections.sort(nums,com);
        System.out.println(nums);
    }
}
