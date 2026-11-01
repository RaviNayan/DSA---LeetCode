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
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> ds = new ArrayList<>();
        if ( root == null) return ds;
        if ((root.left== null) && (root.right==null)){
            ds.add(root.val);
            return ds;
        }
        return preorder(root, ds);
    }
    public List<Integer> preorder(TreeNode root, List<Integer> ds){
        if (root==null) return ds;
        ds.add(root.val);
        preorder(root.left, ds);
        preorder(root.right, ds);
        return ds;
    }
}