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
    public List<String> binaryTreePaths(TreeNode root) {
        List<String> list = new ArrayList<>();
        if(root != null){
            searchBT(root,"",list);
        }
        return list;
    }

    public void searchBT(TreeNode root, String path, List<String> list){
        if(root.left == null & root.right == null){
            list.add(path+root.val);
        }
        if(root.left != null){
            searchBT(root.left,path+root.val+"->",list);
        }
        if(root.right != null){
            searchBT(root.right,path+root.val+"->",list);
        }
    }
}