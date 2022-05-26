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
        List<List<Integer>> ls = new ArrayList<>();
        Queue<TreeNode> q = new LinkedList<>();            
         if(root==null){
            return new ArrayList<>();
        }
        q.add(root);
        boolean reverse=false;
        while(!q.isEmpty()){   
            int size=q.size();
            List<Integer> levelList = new ArrayList<>();
            while(size>0){
                root=q.poll();
                levelList.add(root.val);
                if(root.left!=null)q.add(root.left);
                if(root.right!=null)q.add(root.right);  
                size--;
            }
             if(reverse)Collections.reverse(levelList);
             ls.add(levelList);
             reverse=!reverse;
        }
        return ls;
    }    
   
}