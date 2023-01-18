import java.util.Set;
import java.util.TreeSet;

public class Ticket4 {
    public static boolean hasOdd(Set<Integer> set) {
        if (!set.isEmpty()){
            for (Integer num: set) {
                if (!(num%2==0))
                    return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        Set<Integer> set = new TreeSet<>();
        for (int i = 0; i < 20; i++) {
            set.add(i);
        }
        System.out.println(hasOdd(set));
    }
}
