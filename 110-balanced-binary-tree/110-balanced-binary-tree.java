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
   
   public boolean isBalanced(TreeNode root) {  
   if(root==null){
       return true;
   }
   else{
       int leftHeight=height(root.left);
       int rightHeight=height(root.right);
       if(Math.abs(leftHeight-rightHeight)<=1 && isBalanced(root.left) && isBalanced(root.right) ){
           return true;
       }else{
           return false;
   }
   }
   
}
public int height(TreeNode node){
    int currentHeight=0;
    if(node==null){
        return 0;
    }
    else{
        return Math.max(height(node.left), height(node.right))+1;
        }
    }
}
