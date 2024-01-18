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
     HashMap<String, Integer> map = new HashMap<>();
     List<TreeNode> list = new ArrayList<>();
    public List<TreeNode> findDuplicateSubtrees(TreeNode root) {
        helper(root);
        return list;
        
    }
    public String helper(TreeNode root){

        if(root == null) return "$";
        String result = root.val + "," +  helper(root.left) + "," + helper(root.right);
        map.put(result ,map.getOrDefault(result, 0)+1);
        if(map.get(result) == 2) list.add(root);
        return result;
        

    }
}