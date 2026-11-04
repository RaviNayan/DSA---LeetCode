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
        List<Integer> ds = new ArrayList<>();
        return inorder(root, ds);
    }

    public List<Integer> inorder(TreeNode root, List<Integer> ds) {
        if (root == null)
            return ds;
        if (root.left != null) {
            ds = inorder(root.left, ds);
        }
        ds.add(root.val);
        if (root.right != null) {
            ds = inorder(root.right, ds);
        }
        return ds;
    }
}