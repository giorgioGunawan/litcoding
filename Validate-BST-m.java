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
    public boolean isValidBST(TreeNode root) {
        
        var array = new ArrayList<Integer>();
        intoArray(root, array);
        for(int i = 1; i < array.size(); i++){
            if(array.get(i) <= array.get(i-1)){
                return false;
            }
        }
        return true;
    }
    
    private void intoArray(TreeNode root, ArrayList<Integer> array){
        
        if(root == null)
            return;
        
        intoArray(root.left, array);
        array.add(root.val);
        intoArray(root.right, array);
    }
}
