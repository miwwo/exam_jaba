package ticket7;

public class LinkedIntList {
    private ListNode front;
    LinkedIntList() {
        front = new ListNode();
    }

    public void add(int data) {
        ListNode cur = front;
        while (cur.next!=null) {
            cur = cur.next;
        }
        cur.data = data;
        cur.next = new ListNode();
    }

    public void removeAll(LinkedIntList list2) {
        ListNode cur1 = front;
        ListNode cur2 = list2.front;

        while(cur2.next != null) {
            while(cur1.next!=null && cur1.next.next!=null){
                if (cur1 == front && cur1.data == cur2.data)
                {
                    front = cur1 = cur1.next;
                }
                if(cur1.next.data == cur2.data)
                {
                    cur1.next = cur1.next.next;
                }
                cur1 = cur1.next;
            }
            if (cur1.data == cur2.data)
                cur1.next = null;
            cur1 = front;
            /*while (front.data == cur2.data)
                front = front.next;
            cur1 = front;
            while (cur1.next != null && cur1.next.next != null) {
                if (cur1.next.data == cur2.data)
                    cur1.next = cur1.next.next;
                cur1 = cur1.next;
                if (cur1.next != null && cur1.next.data == cur2.data)
                    cur1.next = null;
            }*/

            cur2 = cur2.next;
        }
    }

    @Override
    public String toString() {
        String res = "";
        res += "LinkedIntList:";

        ListNode cur = front;
        while (cur.next != null) {
            res += " " + cur.data;
            cur = cur.next;
        }
        return res;
    }
}
