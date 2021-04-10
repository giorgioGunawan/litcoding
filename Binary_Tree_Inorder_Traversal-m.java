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
    public List<Integer> inorderTraversal(TreeNode root) {
        var list = new ArrayList<Integer>();
        recur(root, list);
        return list;
    }
    
    private void recur(TreeNode root, List<Integer> list){
        if(root == null)
            return;
        recur(root.left, list);
        // do something here
        list.add(root.val);
        recur(root.right, list);
    }
}
