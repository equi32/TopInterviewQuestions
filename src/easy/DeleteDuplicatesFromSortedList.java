package easy;

public class DeleteDuplicatesFromSortedList {

    static class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }

    static ListNode deleteDuplicates(ListNode head) {
        if (head == null) return head;

        ListNode temp = head;

        while (temp != null) {
            if (temp.next != null && temp.val == temp.next.val) {
                temp.next = temp.next.next;
            } else {
                temp = temp.next;
            }
        }

        return head;
    }

    static void main(String[] args) {
        ListNode node3b = new ListNode(3);
        ListNode node3 = new ListNode(3, node3b);
        ListNode node2 = new ListNode(2, node3);
        ListNode node1b = new ListNode(1, node2);
        ListNode node1 = new ListNode(1, node1b);

        System.out.println(deleteDuplicates(node1).val);
    }
}
