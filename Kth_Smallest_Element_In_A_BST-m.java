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
    public int kthSmallest(TreeNode root, int k) {
        var array = new ArrayList<Integer>();
        preorderFunc(root, array);
        return array.get(k-1);
    }
    private void preorderFunc(TreeNode root, ArrayList<Integer> array){
        if(root == null)
            return;
        preorderFunc(root.left, array);
        array.add(root.val);
        preorderFunc(root.right, array);
    }
}
