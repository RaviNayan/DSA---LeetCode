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

    public boolean targetReach(TreeNode root, int targetSum, int sum) {
        if (root == null)
            return false;
        if (root.left == null && root.right == null) {
            if (targetSum == sum)
                return true;
            else
                return false;
        }

        if ((root.left != null) && (targetReach(root.left, targetSum, sum + root.left.val))) {
            return true;
        }

        if ((root.right != null) && (targetReach(root.right, targetSum, sum + root.right.val))) {
            return true;
        }

        return false;
    }

    public boolean hasPathSum(TreeNode root, int targetSum) {
        if (root == null)
            return false;
        if ((root.left == null && root.right == null) && (root.val == targetSum))
            return true;
        if ((root.left == null || root.right == null) && (root.val == targetSum))
            return false;
        return targetReach(root, targetSum, root.val);
    }
}