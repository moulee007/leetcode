/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    int result = Integer.MAX_VALUE;
    TreeNode prev =  null;
    public int minDiffInBST(TreeNode root) {
        helper(root);
        return result;
    }
    public void helper(TreeNode root){//used for traversals (void functions)
        if(root == null) return ;
        helper(root.left);
       
        if(prev != null){
             System.out.println("root->"+ root.val + "prev->"+ prev.val);//debug
             result = Math.min(result,(root.val - prev.val));
        }

        prev = root;
        
        helper(root.right);
        

    }
}