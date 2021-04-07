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
    public boolean isSubtree(TreeNode s, TreeNode t) {
        var arrayS = new ArrayList<Integer>();
        var arrayT = new ArrayList<Integer>();
        StringBuilder strS = new StringBuilder();
        StringBuilder strT = new StringBuilder();
        preorder(s, strS);
        preorder(t, strT);
        System.out.println(strS);
        System.out.println(strT);
        return strS.indexOf(strT.toString()) == -1 ? false: true;
    }
    
    private void preorder(TreeNode s, StringBuilder str){
        
        if(s == null){
            str.append("n");
            return;
        }
        str.append("#" + String.valueOf(s.val));
        preorder(s.left, str);
        preorder(s.right, str);
    }
}
