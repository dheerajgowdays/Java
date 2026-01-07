import java.util.HashMap;
import java.util.Map;

public class maps {
    public static void main(String args[]){
        Map<String,Integer> students = new HashMap<String,Integer>();
        students.put("Dheeraj",56);
        students.put("Hardhik",100);
        students.put("Bharath",70);
        students.put("Charan",99);

        System.out.println(students.keySet());
        for(String key: students.keySet())
        {
            System.out.println(key+":"+students.get(key));
        }
    }
}
