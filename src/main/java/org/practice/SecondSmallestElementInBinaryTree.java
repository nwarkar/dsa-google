package org.practice;

import java.util.*;

public class SecondSmallestElementInBinaryTree {
    /*
     * Definition for a binary tree node.
       Preorder Traversal = BSF
     */

    public static void main(String[] args) {
        TreeNode right = new TreeNode(4, null, null);
        TreeNode left = new TreeNode(1, null, new TreeNode(2));
        TreeNode root = new TreeNode(3, left, right);
        int k =1;
        Integer smallestElement = inorderTraversal(root, k);
        System.out.println(smallestElement);
    }
    public static int inorderTraversal(TreeNode root, int k) {
        Set<Integer> integers = new TreeSet<>();
        inOrder(integers, root);
        if (integers.size() == 1) return -1;
        int secondMin = 0;
        int count = 0;
        Iterator<Integer> iterator =integers.stream().iterator();
        while (iterator.hasNext() && count <=1) {
            secondMin = iterator.next();
            count ++;
        }        
        return secondMin;
    }

    private static void inOrder(Set<Integer> integers, TreeNode root) {
        if(root == null)
            return;
        inOrder(integers, root.left);
        integers.add(root.val);
        inOrder(integers, root.right);
    }


}
