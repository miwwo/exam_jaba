package Ticket9;

public class Main {
    public static void main(String[] args) {
        LinkedIntList list = new LinkedIntList();
        list.add(14);
        list.add(14);
        list.add(14);
        System.out.println(list);
        list.removeDuplicates();
        System.out.println(list);
    }
}
