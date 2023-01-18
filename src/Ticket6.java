import java.util.*;

public class Ticket6 {

    public static void guavaSort(String[] array) {
        Set<String> words = new TreeSet<>();
        for (var word: array) {
            words.add(word);
        }
        Map<String,Integer> res = new TreeMap<>();
        for (var word: words) {
            res.put(word,0);
        }
        for (int i = 0; i < array.length; i++) {
            res.put(array[i],res.getOrDefault(array[i],0)+1);
        }
        int i = 0;
        for (var entry: res.entrySet()) {
            for (int j = 0; j < entry.getValue(); j++) {
                array[i++] = entry.getKey();
            }
        }

    }
    public static void main(String[] args) {
        String[] testArray = new String[] {"Farm", "Zoo", "Car", "Apple", "Bee", "Golf", "Bee", "Dog", "Golf", "Zoo", "Zoo", "Bee", "Bee", "Apple"};
        guavaSort(testArray);
        System.out.println(Arrays.asList(testArray).toString());
    }
}
