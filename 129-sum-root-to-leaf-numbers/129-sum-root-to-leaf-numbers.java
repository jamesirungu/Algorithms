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
    int sum=0;
    public int sumNumbers(TreeNode root) {
        sum=0;
        getSumHeight(root,"0");
        return sum;
    }
    void getSumHeight(TreeNode root, String currSum){     
        if(root==null){
            return;
        }
        
        if(root.left==null && root.right==null){ 
            currSum=currSum+root.val;
            sum=Integer.parseInt(currSum)+sum;
            currSum="0";
            return;
        }       
        currSum=currSum+root.val;
        getSumHeight(root.left,currSum);
        getSumHeight(root.right,currSum);
    }
    
}