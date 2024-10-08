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
    public TreeNode invertTree(TreeNode root) {
        // base case
        if(root != null){
            //invert child tress
            invertTree(root.left);
            invertTree(root.right);

            //swap
            TreeNode temp = root.right;
            root.right = root.left;
            root.left = temp;
        }

        return root;
    }

    //n = number of nodes in the tree
    //time : O(n)
    //space : o(n)
}