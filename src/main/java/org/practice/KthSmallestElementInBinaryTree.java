package org.practice;

import java.util.ArrayList;
import java.util.List;

public class KthSmallestElementInBinaryTree {
    /*
     * Definition for a binary tree node.

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
        List<Integer> integers = new ArrayList<>();
        inOrder(integers, root);
        return integers.get(k-1);
    }

    private static void inOrder(List<Integer> integers, TreeNode root) {
        if(root == null)
            return;
        inOrder(integers, root.left);
        integers.add(root.val);
        inOrder(integers, root.right);
    }


}
