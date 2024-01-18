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
    
    public List<TreeNode> findDuplicateSubtrees(TreeNode root) {
         HashMap<String, Integer> map = new HashMap<>();
         List<TreeNode> list = new ArrayList<>();
        helper(root,map,list);
        return list;
        
    }
    public String helper(TreeNode root,HashMap<String,Integer> map, List<TreeNode> list){

        if(root == null) return "$";
        String result = root.val + "," +  helper(root.left,map,list) + "," + helper(root.right,map,list);
        map.put(result ,map.getOrDefault(result, 0)+1);
        if(map.get(result) == 2) list.add(root);
        return result;
        

    }
}