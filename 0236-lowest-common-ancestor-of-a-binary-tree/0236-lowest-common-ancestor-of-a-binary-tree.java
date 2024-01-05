/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
     public TreeNode node = null;
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {

        helper(root,p,q);
        return node;
    }
    public boolean helper(TreeNode root,TreeNode p, TreeNode q){
      if(root == null) return false;
      if(p == root || q == root){
          node = root;
          System.out.println(root.val);
          return true;
      }
      boolean left = helper(root.left,p,q);
      boolean right = helper(root.right,p,q);
      if(left == true && right == true){
          node = root;
          System.out.println(root.val);
          return true;
      }
      else if(left == true || right == true) return true;
      return false;
    }
}