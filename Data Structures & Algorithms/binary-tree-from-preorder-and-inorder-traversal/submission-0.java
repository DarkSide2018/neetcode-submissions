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
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        Map<Integer,Integer> inorderIndexMap = new HashMap<>();
        for(int i=0;i<inorder.length;i++){
            inorderIndexMap.put(inorder[i],i);
        }
        return buildSubTree(
            preorder,0,preorder.length-1,
            inorder,0,inorder.length-1,
            inorderIndexMap);
    }

    private TreeNode buildSubTree(
        int[] preOrder, int preStart,int preEnd,
        int[] inOrder, int inStart, int inEnd,
        Map<Integer,Integer> inorderIndexMap)
    {
        if(preStart>preEnd || inStart>inEnd){
            return null;
        }

        int rootVal=preOrder[preStart];
        TreeNode root = new TreeNode(rootVal);
        int rootIndexInorder = inorderIndexMap.get(rootVal);


        int rootIndexInInorder = inorderIndexMap.get(rootVal);
        int leftSubTreeSize = rootIndexInInorder-inStart;

        root.left=buildSubTree(preOrder,preStart+1,preStart+leftSubTreeSize,
        inOrder,inStart,rootIndexInInorder-1,inorderIndexMap);

        root.right = buildSubTree(preOrder,preStart+1+leftSubTreeSize,preEnd,inOrder,rootIndexInInorder+1,inEnd,inorderIndexMap);
        
        return root;
    }
}
