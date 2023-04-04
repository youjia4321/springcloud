package com.youjia.web.controller.algorithm.string;


/**
 * @author youjia
 * @version 1.0
 * @description
 * @className TreeNode
 * @date 2023/3/27 14:03
 */
public class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode() {}
    TreeNode(int val) { this.val = val; }
    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }

    public boolean isSymmetric(TreeNode root) {
        if(root == null) {
            return true;
        }
        return isSameNode(root.left, root.right);
    }

    public boolean isSameNode(TreeNode left, TreeNode right) {
        if(left == null && right == null) return true;
        if(left == null) return false;
        if(right == null) return false;
        if(left.val == right.val) {
            return isSameNode(left.left, right.right) && isSameNode(left.right, right.left);
        }
        return false;
    }

}