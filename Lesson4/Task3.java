package Lesson4;

import java.util.*;


public class Task3 {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(2);
        root.left.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.right.left = new TreeNode(3);
        root.right.right = new TreeNode(4);

        TreeNode root2 = new TreeNode(1);
        root2.left = new TreeNode(2);
        root2.right = new TreeNode(2);
        root2.left.right = new TreeNode(3);
        root2.right.right = new TreeNode(3);
        System.out.println(isSymmetric(root));
    }

    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode() {
        }

        TreeNode(int val) {
            this.val = val;
        }

        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }


    public static boolean isSymmetric(TreeNode root) {
        if (root == null) return true;
        if (root.left == null && root.right == null) return true;
        if (root.left == null || root.right == null) return false;

        ArrayDeque<TreeNode> stack = new ArrayDeque<>();
        stack.add(root.left);
        stack.add(root.right);

        while (!stack.isEmpty()) {
            TreeNode step1 = stack.pop();
            TreeNode step2 = stack.pop();

            if ((step1.val != step2.val) || (step1.left == null ^ step2.right == null) ||
                    (step1.right == null ^ step2.left == null)) {
                return false;
            }

            if (step1.left != null) {
                stack.add(step1.left);
                stack.add(step2.right);
            }
            if (step1.right != null) {
                stack.add(step1.right);
                stack.add(step2.left);
            }
        }
        return true;
    }

}
