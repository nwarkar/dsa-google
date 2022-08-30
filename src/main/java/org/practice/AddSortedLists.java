package org.practice;

public class AddSortedLists {

    public static void main(String[] args) {
        ListNode list1 = new ListNode(1, new ListNode(2, new ListNode(4)));
        ListNode list2 = new ListNode(1, new ListNode(3, new ListNode(4)));
        ListNode  result =mergeTwoLists(list1,list2);

        while (result != null) {
            System.out.print(result.val + "->");
            result = result.next;
        }
    }

    public static ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode head = new ListNode();
        ListNode tail = head;
        while (list1 != null || list2 != null) {
            if (list2 == null || (list1 != null && list1.val < list2.val)) {
                tail.next = list1;
                tail = list1;
                list1 = list1.next;
            } else  {
                tail.next = list2;
                tail = list2;
                list2 = list2.next;
            }
        }
        return head.next;
    }

}
