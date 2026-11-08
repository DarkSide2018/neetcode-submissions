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

        List<Integer> leaves1 = new ArrayList<>();
        List<Integer> leaves2 = new ArrayList<>();

        collectLeaves(root1,leaves1);
        collectLeaves(root2,leaves2);

        return leaves1.equals(leaves2);


    }


    private TreeNode buildTree(Integer[] arr){
        if(arr==null || arr.length == 0 || arr[0] == null){
            return null;
        }

        TreeNode root = new TreeNode(arr[0]);

        Queue<TreeNode> queue = new ArrayDeque<>();

        queue.offer(root);

        int i=1;

        while(!queue.isEmpty() && i<arr.length){
            TreeNode current = queue.poll();

            if(i<arr.length){
                Integer leftVal = arr[i++];

                if(leftVal != null){
                    current.left = new TreeNode(leftVal);

                    queue.offer(current.left);
                }
            }

            if(i<arr.length){
                Integer rightVal = arr[i++];

                if(rightVal != null){
                    current.right = new TreeNode(rightVal);
                    queue.offer(current.right);
                }
            }
        }

        return root;
    }

    private void collectLeaves(TreeNode node, List<Integer> leaves){
        if(node == null){
            return;
        }

        if(node.left == null && node.right == null){
            leaves.add(node.val);
            return;
        }

        collectLeaves(node.left, leaves);
        collectLeaves(node.right,leaves);
    }
}
