package easy;

public class MergeTwoSortedLists {

    static class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }

    static ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode dummy = new ListNode();
        ListNode cur = dummy;

        while(list1 != null && list2 != null) {
            if (list1.val < list2.val) {
                cur.next = list1;
                list1 = list1.next;
            } else {
                cur.next = list2;
                list2 = list2.next;
            }

            cur = cur.next;
        }

        cur.next = list1 != null ? list1 : list2;

        return dummy.next;
    }

    static void main(String[] args) {
        ListNode node3 = new ListNode(4);
        ListNode node2 = new ListNode(2, node3);
        ListNode node1 = new ListNode(1, node2);

        ListNode node3b = new ListNode(4);
        ListNode node2b = new ListNode(3, node3b);
        ListNode node1b = new ListNode(1, node2b);

        System.out.println(mergeTwoLists(node1, node1b).val);
    }
}
