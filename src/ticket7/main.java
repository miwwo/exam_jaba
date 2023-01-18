package ticket7;

public class main {
    public static void main(String[] args) {
        LinkedIntList list1 = new LinkedIntList();
        LinkedIntList list2 = new LinkedIntList();
        list1.add(1);
        list1.add(3);
        list1.add(4);
        list1.add(5);
        list1.add(7);

        list2.add(1);
        list2.add(2);
        list2.add(4);
        list2.add(5);
        list2.add(5);

        System.out.println(list1.toString());
        System.out.println(list2.toString());
        list2.removeAll(list1);
        System.out.println(list1.toString());
        System.out.println(list2.toString());
    }
}
