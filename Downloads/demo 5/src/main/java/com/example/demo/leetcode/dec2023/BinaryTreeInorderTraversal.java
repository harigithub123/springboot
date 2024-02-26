package com.example.demo.leetcode.dec2023;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class BinaryTreeInorderTraversal {
    public static void main(String[] args) {
        BinaryTreeInorderTraversal traveral = new BinaryTreeInorderTraversal();
        TreeNode four = new TreeNode(4);
        TreeNode two = new TreeNode(2,  four, null);
        TreeNode three = new TreeNode(3);
        TreeNode one = new TreeNode(1, two, three);

        System.out.println(traveral.inorderTraversal(one));

        System.out.println(traveral.inorderTraversal(null));

    }
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        if (Objects.nonNull(root)) {
            inorderTraversal(list, root);
        }
        return list;
    }

    private void inorderTraversal(List<Integer> list, TreeNode root) {
        if(Objects.nonNull(root.left)) {
            inorderTraversal(list, root.left);
        }
        list.add(root.val);
        if(Objects.nonNull(root.right)) {
            inorderTraversal(list, root.right);
        }
    }
}

class TreeNode {
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
}