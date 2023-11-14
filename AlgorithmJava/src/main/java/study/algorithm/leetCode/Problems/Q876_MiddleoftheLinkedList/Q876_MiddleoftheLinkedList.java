package study.algorithm.leetCode.Problems.Q876_MiddleoftheLinkedList;

public class Q876_MiddleoftheLinkedList {

    public void main(String[] args){

       ListNode node = new ListNode();
        middleNode(node);

    }

    public static ListNode middleNode(ListNode head) {
        ListNode slow = head, fast = head;
        System.out.println("====>" + slow);
        System.out.println("====>" + fast);
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

      public class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }

}

