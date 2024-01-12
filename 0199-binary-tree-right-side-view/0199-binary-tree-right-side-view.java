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
    public List<Integer> rightSideView(TreeNode root) {
        
        Deque<TreeNode> deque = new ArrayDeque<>();
        List<Integer> result = new ArrayList<>();
        if(root == null) return result;
        deque.offer(root);
        while(!deque.isEmpty()){
            TreeNode ele = null;
            int length = deque.size();
            while( length-- > 0){
             ele =  deque.poll();
             if(ele.left != null) deque.offer(ele.left);
             if(ele.right != null) deque.offer(ele.right);
            }
            result.add(ele.val);


        }
        return result;
        
    }
}