package study.algorithm.leetCode.Problems.Q2236_RootEqualsSumofChildren;

public class Q2236_RootEqualsSumofChildren {

    public static void main(String[] args){
        TreeNode left = new TreeNode(3);
        TreeNode right = new TreeNode(4);
        TreeNode tree = new TreeNode(10, right, left);
        checkTree(tree);

    }

    public static boolean checkTree(TreeNode root) {

        return root.val == root.left.val + root.right.val;
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

