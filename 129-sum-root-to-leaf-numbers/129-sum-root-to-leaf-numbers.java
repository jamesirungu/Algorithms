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
    // treat numbers like a string, concatenate at every step and use java method Integer.parseInt() to convert to integer every time we reach a leaf
    
    // variable sum holds the sum to be returned
    // a dfs method getSumHeight ads the node.val(root.val) at the end of the string,
    //whenever root is null, return 
    //when root.left is null and root.right is null, it means we got a leaf. convert the string so far to integer and add it to sum
    // when preorder is complete return sum from the main
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