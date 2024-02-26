package com.example.demo.leetcode.dec2023;


import java.util.Objects;

/**
 * 8th Dec Problem
 */
public class TreeToString {
    public static void main(String[] args) {
        TreeToString tts = new TreeToString();
        TreeNode1 sample1 = new TreeNode1(10);
        System.out.println(tts.tree2str(sample1));
        TreeNode1 four = new TreeNode1(4);
        TreeNode1 two = new TreeNode1(2,  null, four);
        TreeNode1 three = new TreeNode1(3);
        TreeNode1 one = new TreeNode1(1, two, three);
        System.out.println(tts.tree2str(one));
    }
    public String tree2str(TreeNode1 root) {
        StringBuffer str = new StringBuffer();
        str.append(root.val);
        boolean leftNodePresent=false;
        if(Objects.nonNull(root.left)) {
            leftNodePresent = true;
            if(root.left.left == null && root.left.right == null) {
                str.append("(").append(root.left.val).append(")");
            } else {
                str.append("(").append(tree2str(root.left)).append(")");
            }
        }
        if(Objects.nonNull(root.right)) {
            if(!leftNodePresent) {
                str.append("()");
            }
            if(root.right.left == null && root.right.right == null) {
                str.append("(").append(root.right.val).append(")");
            } else {
                str.append("(").append(tree2str(root.right)).append(")");
            }

        }
        return str.toString();
    }
}

 class TreeNode1 {
      int val;
      TreeNode1 left;
      TreeNode1 right;
      TreeNode1() {}
      TreeNode1(int val) { this.val = val; }
      TreeNode1(int val, TreeNode1 left, TreeNode1 right) {
          this.val = val;
          this.left = left;
          this.right = right;
      }
 }
