package Ticket9;


import Ticket9.ListNode;

public class LinkedIntList {
    private ListNode front;
    public LinkedIntList(){
        front = null;
    }

    public void add(int data) {
        if (front == null) {
            front = new ListNode(data);
        }
        else {
            ListNode cur = front;
            while (cur.next != null) {
                cur = cur.next;
            }
            cur.next = new ListNode(data);
        }
    }

    public void removeDuplicates() {
        var current = front;
        while (current != null) {
            var runner = current;
            while (runner.next != null) {
                if (runner.next.data == current.data) {
                    runner.next = runner.next.next;
                } else {
                    runner = runner.next;
                }
            }
            current = current.next;
        }
    }

    @Override
    public String toString() {
        String res = "LinkedIntList:";
        ListNode cur = front;
        while (cur.next != null) {
            res += " " + cur.data;
            cur = cur.next;
        }
        res += " " + cur.data;
        return res;
    }
}
