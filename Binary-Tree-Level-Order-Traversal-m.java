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
    public List<List<Integer>> levelOrder(TreeNode root) {
        var ans = new ArrayList<List<Integer>>();
        var hMap = new HashMap<Integer,ArrayList<Integer>>();
        if(root == null)
            return ans;
        
        var tempArr = new ArrayList<Integer>();
        tempArr.add(root.val);
        hMap.put(0, tempArr);
        recur(root, 1, hMap);
        for(var arr:hMap.entrySet()){
            ans.add(arr.getValue());
        }
        return ans;
    }
    private void recur(TreeNode root, int level, HashMap<Integer,ArrayList<Integer>> hMap){
        if(root == null)
            return;
        if(root.left == null && root.right == null){
            //System.out.println(root.val);
            return;
        }
        
        var tempArr = new ArrayList<Integer>();
        if(root.left != null) {
            tempArr.add(root.left.val);
        }
        if(root.right != null) 
            tempArr.add(root.right.val);
        
        if(hMap.containsKey(level)){
            hMap.get(level).addAll(tempArr);
        }else if(!hMap.containsKey(level)){
            hMap.put(level, tempArr);
        }
        recur(root.left, level+1, hMap);
        recur(root.right, level+1, hMap);
        
    }
}
