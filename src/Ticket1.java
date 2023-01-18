import java.util.ArrayList;
import java.util.Arrays;

public class Ticket1 {
    public static ArrayList<Integer> alternate(ArrayList<Integer> list1, ArrayList<Integer> list2){
        ArrayList<Integer> finalList = new ArrayList<>();
        int len_1 = list1.size();
        int len_2 = list2.size();
        if (len_1<len_2){
            for (int i = 0; i < len_1; i++) {
                finalList.add(list1.get(i));
                finalList.add(list2.get(i));
            }
            for (int i = len_1; i < len_2; i++) {
                finalList.add(list2.get(i));
            }
        } else {
            for (int i = 0; i < len_2; i++) {
                finalList.add(list1.get(i));
                finalList.add(list2.get(i));
            }
            for (int i = len_2; i < len_1; i++) {
                finalList.add(list1.get(i));
            }
        }
        return finalList;
    }

    public static void main(String[] args) {
        ArrayList<Integer> list1 = new ArrayList<>(Arrays.asList());
        ArrayList<Integer> list2 = new ArrayList<>(Arrays.asList());
        System.out.println((alternate(list1,list2)).toString());
    }

}