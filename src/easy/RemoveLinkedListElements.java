package easy;

public class RemoveLinkedListElements {
    static class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }

    static ListNode removeElements(ListNode head, int val) {
        ListNode dummy = new ListNode();
        ListNode cur = dummy;

        while (head != null) {
            if (head.val != val) {
                cur.next = head;
                cur = cur.next;
            }

            head = head.next;
        }

        if (cur.next != null && cur.next.val == val) {
            cur.next = null;
        }

        return dummy.next;
    }

    static void main() {
        ListNode node7 = new ListNode(6);
        ListNode node6 = new ListNode(5, node7);
        ListNode node5 = new ListNode(4, node6);
        ListNode node4 = new ListNode(3, node5);
        ListNode node3 = new ListNode(6, node4);
        ListNode node2 = new ListNode(2, node3);
        ListNode node1 = new ListNode(1, node2);

        System.out.println(removeElements(node1, 6));
    }
}
