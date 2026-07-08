public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        int lenA = 0;
        int lenB = 0;

        ListNode a = headA;
        ListNode b = headB;

        while (a != null) {
            lenA++;
            a = a.next;
        }

        while (b != null) {
            lenB++;
            b = b.next;
        }

        a = headA;
        b = headB;

        while (lenA > lenB) {
            a = a.next;
            lenA--;
        }

        while (lenB > lenA) {
            b = b.next;
            lenB--;
        }

        while (a != null && b != null) {
            if (a == b)
                return a;

            a = a.next;
            b = b.next;
        }

        return null;
    }
}