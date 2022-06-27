/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> children;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, List<Node> _children) {
        val = _val;
        children = _children;
    }
};
*/

class Solution {
    /* 
    - define 2 stacks
    -push the current node to the first stack
    -loop through the first stack, getting children and pushing them to second stack 
    -while looping add values of nodes in 1st stack to list
    -if the 1st stack is empty,add the list to the return list. also pop children in 2nd stack and push them to 1st stack
    -check again of 1st stack is empty, if so again push children to 2nd stack and repeat the same until both stacks are empry
    */
    public List<List<Integer>> levelOrder(Node root) {
        List<List<Integer>> result = new ArrayList<>();
        if(root==null){
            return result;
        }
        if(root.children==null){
            return null;
        }
        
        Stack<Node> s = new Stack<>();
        Stack<Node> s2 = new Stack<>();
        s.push(root);
        
        while(!s.isEmpty() || !s2.isEmpty()){
            List<Integer> ls=new ArrayList<>();;
            while(!s.isEmpty()){                  
                Node curr = s.pop(); 
                ls.add(curr.val);
                System.out.print(curr.val + " ");
                for(int i =0;i<curr.children.size();i++){
                    s2.add(curr.children.get(i));
                }            
            }
            
            while(!s2.isEmpty()){
                s.push(s2.pop());
            }
            result.add(ls);
        }
     return result;
    }      
}