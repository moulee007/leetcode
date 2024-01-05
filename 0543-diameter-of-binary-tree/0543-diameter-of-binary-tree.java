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
    public int max_count = 0;
    public int diameterOfBinaryTree(TreeNode root) {
        treedepth(root);
        return max_count;
    }
    public int treedepth(TreeNode root){
        if(root == null) return 0;
        int left = treedepth(root.left);
        int right = treedepth(root.right);
        max_count = ((left+right)> max_count)? (left+right):max_count ;
        return Math.max(left,right) + 1;
    }
}