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
    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        List<List<Integer>> res= new ArrayList<>();
        path(root,targetSum, new ArrayList<>(),res);
        return res;
    }
    void path(TreeNode root, int ts, List<Integer> p,List<List<Integer>> res){
        if(root==null) return;
        p.add(root.val);
        if(root.left==null && root.right==null && ts==root.val){
            res.add(new ArrayList<>(p));
        }
        else{
            path(root.left,ts-root.val,p,res);
            path(root.right,ts-root.val,p,res);
        }
        p.remove(p.size()-1);
    }
}