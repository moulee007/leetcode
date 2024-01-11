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
    public TreeNode deleteNode(TreeNode root, int key) {
    if(root == null) return null;
    if(root.val == key){
        if(root.left != null && root.right != null){
            TreeNode temp = root.left;
            TreeNode curr = root.right;
            while(curr.left != null){
                curr = curr.left;
            }
            curr.left = temp;
            return root.right;


        }
        else if(root.right != null){
            return root.right;
        }
        else return root.left;
    }
    if(root.val > key){
        root.left = deleteNode(root.left,key);
    }
    if(root.val < key){
        root.right = deleteNode(root.right,key);
    }
    return root;
        
    }
}