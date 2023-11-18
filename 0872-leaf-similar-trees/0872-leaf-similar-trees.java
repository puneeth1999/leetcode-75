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
    public boolean leafSimilar(TreeNode root1, TreeNode root2) {
        List<Integer> list1 = getLeafNodes(root1, new ArrayList<Integer>());
        List<Integer> list2 = getLeafNodes(root2, new ArrayList<Integer>());
        if(list1.size() != list2.size()){
            return false;
        }
        for(int i = 0; i < list1.size(); i++){
            if(list1.get(i) != list2.get(i)){
                return false;
            }
        }
        return true;
    }
    
    public ArrayList<Integer> getLeafNodes(TreeNode root, ArrayList<Integer> list){
        if(root == null) return list;
        if(root.left == null && root.right == null){
            list.add(root.val);
        } else {
            list = getLeafNodes(root.left, list);
            list = getLeafNodes(root.right, list);
        }
        return list;
    }
}