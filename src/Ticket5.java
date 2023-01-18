import java.util.*;

public class Ticket5 {
    public static int rarest(Map<String,Integer> map) {
        int rare = -1;
        Set<Integer> values = new TreeSet<>();


        for(Map.Entry<String,Integer> entry: map.entrySet()) {
            values.add(entry.getValue());
        }

        return rare;
    }
    public static void main(String[] args) {
        Map<String,Integer> map = new TreeMap<>();
        map.put("a",8);
        map.put("b",8);
        map.put("c",8);
        map.put("d",6);
        map.put("f",4);
        map.put("l",6);
        map.put("fd",8);
        map.put("sd",6);
        map.put("s",4);
        rarest(map);
    }
}
