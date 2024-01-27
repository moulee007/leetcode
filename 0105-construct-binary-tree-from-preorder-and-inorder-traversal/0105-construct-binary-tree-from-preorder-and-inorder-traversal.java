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
    int index = 0;
    public TreeNode buildTree(int[] preorder, int[] inorder) {
    HashMap<Integer,Integer> map = new HashMap<>();
    
    for(int i = 0; i< preorder.length; i++){
        map.put(inorder[i],i);
    }
    return construct(preorder,inorder,0,inorder.length-1,map);
        
    }

    private TreeNode construct(int[] preorder, int[] inorder, int start,int end,
    HashMap<Integer,Integer> map){
        
        if(start > end){
            return null;
        }
        int i = map.get(preorder[index]);
        index++;
        TreeNode root = new TreeNode(inorder[i]);
        root.left = construct(preorder,inorder,start,i-1,map);
        root.right = construct(preorder,inorder,i+1,end,map);
        return root;
    }
  
}