package org.practice;

/**
 * Definition for singly-linked list.
 */


class SumOfLinkedList {

       public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode result = null;
        int value = 0;
        int carry =0;
        while (l1!= null || l2 != null) {
            if (l1 != null && l2 !=null) {
                value = l1.val + l2.val;
            }  else if(l2 == null) {
                value = l1.val;
            } else {
                value = l2.val;
            }
            value = value + carry;
            if (value >=10) {
                carry = value /10;
                value = value %10;
            } else {
                carry =0;
            }
            if (result == null) {
                result = new ListNode(value);
            } else {
                ListNode temp = new ListNode(value);
                ListNode navNode = result;
                while (navNode.next != null) {
                    navNode = navNode.next;
                }
                navNode.next = temp;
            }
            if (l1 != null) {
                l1 = l1.next;
            }
            if(l2 != null) {
                l2 = l2.next;
            }
        }
        if (carry !=0) {
            ListNode temp = new ListNode(carry);
            ListNode navNode = result;
            while (navNode.next != null) {
                navNode = navNode.next;
            }
            navNode.next = temp;
        }
        return result;
    }

    public static void main(String[] args) {
        SumOfLinkedList sumOfLinkedList = new SumOfLinkedList();
        ListNode l1 = new ListNode(9);
        ListNode t2 = new ListNode(9);
        ListNode t3 = new ListNode(9);
        l1.next= t2;
        t2.next=t3;
        ListNode l2 = new ListNode(9);
        ListNode tt2 = new ListNode(9);
        //ListNode tt3 = new ListNode(4);
        l2.next= tt2;
        //tt2.next=tt3;
        ListNode result =  sumOfLinkedList.addTwoNumbers(l1, l2);

        while (result!= null) {
            System.out.print(" "+ result.val);
            result = result.next;
        }
    }
}