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
    public String tree2str(TreeNode root) {
        if(root == null) return "";

        String result = root.val + "";

        String leftnode = tree2str(root.left);
        String rightnode = tree2str(root.right);
        
        if(leftnode.equals("") && rightnode.equals("")){
            return result;
        }
        if(rightnode.equals("")){
            return result + "(" + leftnode + ")";
        }
        if(leftnode.equals("")){
            return result + "()" + "(" + rightnode + ")";
        }
            return result + "(" + leftnode + ")" + "(" + rightnode + ")";          
    }
}