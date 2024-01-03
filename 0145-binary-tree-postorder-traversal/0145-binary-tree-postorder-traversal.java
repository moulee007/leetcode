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
    public List<Integer> postorderTraversal(TreeNode root) {
        Stack<TreeNode> stack = new Stack<>();
        List<Integer> result =  new ArrayList<>();
        TreeNode prev  = null;
        if(root == null) return new ArrayList<>();
        
        while(!stack.isEmpty() || root != null){

           if(root != null){
               stack.push(root);
               root = root.left;
           }
           else{
               TreeNode curr = stack.peek();
               if(curr.right!= null && curr.right != prev){
                   root = curr.right;
               }
               else{
                   result.add(curr.val);
                   prev = curr;
                   stack.pop();
               }
               
           }
           

        }
        return result;

    }
}