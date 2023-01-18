import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class Ticket2 {
    public static void reverse(Map<Integer,String> map){
        Map<String,Integer> resMap = new TreeMap<>();
        /*System.out.println(map.entrySet());
        System.out.println(map.keySet());*/
        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            if (!resMap.containsKey(entry.getValue()))
                resMap.put(entry.getValue(),entry.getKey());
        }
        for (Map.Entry<String, Integer> entry : resMap.entrySet()) {
            System.out.println(entry);
        }
        //Map.Entry<Integer,String>();
    }

    public static void main(String[] args) {
        Map<Integer,String> map = new TreeMap<>();
        map.put(1, "string 1");
        map.put(2, "string 2");
        map.put(3, "string 4");
        map.put(4, "string 4");
        map.put(5, "string 5");
        map.put(6, "string 6");
        reverse(map);
    }
}