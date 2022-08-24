package org.practice;
/*
5 -> 10 -> 19 -> 28
|        |     |          |
7     20    22       35
|              |          |
8            50       40
|                         |
30                    45
----------------------------------------------

//5->7->8->30 ->
//
5-> 7-> 8- > 10 -> 19-> 20->22-> 28-> 30-> 35-> 40-> 45-> 50
//
(val)
//
5->7->8->  new Vlaue - > 30

 */

public class SortTheLinkedList {

    public static void main(String[] args) {
        ListNodeCustom third = new ListNodeCustom(28, null, new ListNodeCustom(35, null, new ListNodeCustom(40, null,new ListNodeCustom(45))));
        ListNodeCustom second = new ListNodeCustom(19, third, new ListNodeCustom(22, null, new ListNodeCustom(50)) );
        ListNodeCustom first = new ListNodeCustom(10, second, new ListNodeCustom(20));
        ListNodeCustom root = new ListNodeCustom(5, first, new ListNodeCustom(7, null, new ListNodeCustom(8, null,new ListNodeCustom(30))));

        ListNodeCustom resultNode = createNewSortedNode(root);
        while (resultNode != null) {
            System.out.print(resultNode.val + "-->");
            resultNode = resultNode.next;
        }

    }

    private static ListNodeCustom createNewSortedNode(ListNodeCustom root) {
        if (root == null) return null;
        ListNodeCustom node;
        ListNodeCustom sublistNode;
        // 5-7-10
        ListNodeCustom Horizantalnode = root;
        while (Horizantalnode != null) {
               sublistNode = Horizantalnode.down;
               while (sublistNode != null) {
                   if(sublistNode.val < Horizantalnode.next.val ) {
                               node = new ListNodeCustom(sublistNode.val);
                               ListNodeCustom previousNxt = Horizantalnode.next;
                               Horizantalnode.next = node;
                               node.next = previousNxt;

                   } else {
                       ListNodeCustom temp = Horizantalnode.next;
                       while (temp.next != null && sublistNode.val > temp.next.val) {
                                temp = temp.next;
                            }
                       node = new ListNodeCustom(sublistNode.val);
                       ListNodeCustom previousNxt = temp.next;
                       temp.next = node;
                       node.next = previousNxt;
                   }
                   sublistNode = sublistNode.down;
               }
            Horizantalnode = Horizantalnode.next;
        }
        return root;
    }

}
