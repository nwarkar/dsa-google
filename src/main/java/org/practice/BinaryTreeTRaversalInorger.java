package org.practice;

import java.util.ArrayList;
import java.util.List;

public class BinaryTreeTRaversalInorger {
    /*
     * Definition for a binary tree node.

     */

    public static void main(String[] args) {
        TreeNode right = new TreeNode(2, new TreeNode(3), null);
        TreeNode root = new TreeNode(1, null, right);
        List<Integer> integers = inorderTraversal(root);
        System.out.println(integers);

    }

    public static List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> integers = new ArrayList<>();
        inOrder(integers, root);
        return integers;
    }

    private static void inOrder(List<Integer> integers, TreeNode root) {
        if(root == null)
            return;
        inOrder(integers, root.left);
        integers.add(root.val);
        inOrder(integers, root.right);

    }


}
