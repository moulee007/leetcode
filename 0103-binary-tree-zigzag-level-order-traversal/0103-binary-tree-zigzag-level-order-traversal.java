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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
          Deque<TreeNode> deque = new ArrayDeque<>();
        List<List<Integer>> result  = new ArrayList<>();
        if(root == null) return result;
        deque.offer(root);
        boolean flag = false;
        while(!deque.isEmpty()){
            List<Integer> list = new ArrayList<>();
            int length = deque.size();
            while(length-- > 0){
                TreeNode ele = deque.poll();
                if(flag == false) list.add(ele.val); else list.add(0,ele.val);
                if(ele.left != null) deque.offer(ele.left);
                if(ele.right != null) deque.offer(ele.right); 
            }
        
            result.add(list);
            flag = (flag==true)? false:true;
        }
        return result;    
        
    }
}