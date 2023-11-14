package study.algorithm.leetCode.Q226_InvertBinaryTree;

import study.algorithm.leetCode.Q2236_RootEqualsSumofChildren.Q2236_RootEqualsSumofChildren;

public class Q226_InvertBinaryTree {

    public static void main(String[] args){
        TreeNode left = new TreeNode(3);
        TreeNode right = new TreeNode(4);
        TreeNode tree = new TreeNode(10, right, left);
        invertTree(tree);

    }

    public static TreeNode invertTree(TreeNode root) {

        if(root == null){
            return root;
        }

        TreeNode tmp = root.left;
        root.left= root.right;
        root.right = tmp;

        invertTree(root.right);
        invertTree(root.left);


        return root;
    }
  public static class TreeNode {
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

 }

