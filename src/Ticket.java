import java.util.Map;
import java.util.TreeMap;

public class Ticket {
    public  static void mystery(Map<String, String> map){
        Map <String, String> res = new TreeMap<String, String>();
        for (String key: map.keySet()){
            if (key.compareTo(map.get(key)) < 0){
                res.put(key, map.get(key));
            } else{
                res.put(map.get(key), key);
            }
        }
        System.out.println(res);
    }
    public static void main(String[] args) {
        Map<String, String> map = new TreeMap<>();
        map.put("2", "5");
        map.put("7", "3");
        map.put("one", "un");
        map.put("three", "trois");
        map.put("four", "quatre");
        mystery(map);
    }
}
