/**
 * 输入某二叉树的前序遍历和中序遍历的结果，请重建出该二叉树。假设输入的前序遍历和中序遍历的结果中都不含重复的数字。
 * 例如输入前序遍历序列{1,2,4,7,3,5,6,8}和中序遍历序列{4,7,2,1,5,3,8,6}，则重建二叉树并返回。 
 * 根据前序遍历第一个节点为父节点，中序遍历父节点左边的为左子树，右边的为右子树的定义重建二叉树。
 * Definition for binary tree
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class reConstructBinaryTree {
    public TreeNode reConstructBinaryTree(int [] pre,int [] in) {
         if(pre == null || in == null || pre.length == 0 || in.length == 0){
            return null;
        }
         return buildTree(pre, in, 0, pre.length - 1, 0, in.length - 1);
    }
    public TreeNode buildTree(int[] pre, int[] in, int preStart, int preEnd, int inStart, int inEnd){
        TreeNode root = new TreeNode(pre[preStart]);
        int rootIn = 0;
        for(; rootIn < in.length; rootIn++){
            if(in[rootIn] == root.val){
                break;
            }
        }
        int leftLength = rootIn - inStart;
        int rightLength = inEnd - rootIn;
        if(leftLength > 0){
            root.left = buildTree(pre, in, preStart + 1, preStart + leftLength, inStart, rootIn - 1);           
        }
        if(rightLength > 0){
            root.right = buildTree(pre, in, preStart + leftLength + 1, preEnd, rootIn + 1, inEnd);   
        }
        return root;
    }
}
