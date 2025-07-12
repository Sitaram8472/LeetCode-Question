import java.lang.classfile.components.ClassPrinter.ListNode;

public class Q_234 {
  public boolean isPalindrome(ListNode head) {
    ListNode mid = foundmid(head);
    // reverse

    ListNode prev = null;
    ListNode curr = mid;
    ListNode next;
    while (curr != null) {
      next = curr.next;
      curr.next = prev;
      prev = curr;
      curr = next;
    }

    ListNode right = prev; // right half head
    ListNode left = head; // left first head

    while (right != null) {
      if (left.val != right.val) {
        return false;
      }
      left = left.next;
      right = right.next;
    }

    return true;

  }

  public static ListNode foundmid(ListNode data) {
    ListNode slow = data;
    ListNode fast = data;

    while (fast != null && fast.next != null) {
      slow = slow.next;
      fast = fast.next.next;
    }
    return slow;
  }
}
