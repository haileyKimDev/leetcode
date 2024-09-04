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
    // Checks if the binary tree is balanced
    public boolean isBalanced(TreeNode root) {
        // A balanced tree should not return a height of -1
        return getHeight(root) != -1;
    }
    
    // Recursive function to get the height of the tree, or return -1 if unbalanced
    private int getHeight(TreeNode node) {
        // If the node is null, its height is considered 0 (base case for recursion)
        if (node == null) return 0;

        // Recursively get the height of the left subtree
        int left = getHeight(node.left);
        // Recursively get the height of the right subtree
        int right = getHeight(node.right);

        // If either subtree is unbalanced (returns -1) or the current node is unbalanced
        if (left == -1 || right == -1 || Math.abs(left - right) > 1) return -1;

        // Return the height of the current node, which is 1 plus the maximum height of its subtrees
        return Math.max(left, right) + 1;
    }
}
//Time :O(N)
//Space :O(N)