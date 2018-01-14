/**
 *从上往下打印出二叉树的每个节点，同层节点从左至右打印。 
 *采用队列先进先出的特点，遍历二叉树，将各个节点及其孩子节点入队列。
 */
 import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;
/**
public class TreeNode {
    int val = 0;
    TreeNode left = null;
    TreeNode right = null;

    public TreeNode(int val) {
        this.val = val;

    }

}
*/
public class PrintFromTopToBottom {
    public ArrayList<Integer> PrintFromTopToBottom(TreeNode root) {
         ArrayList<Integer> list = new ArrayList<Integer>();
         if(root == null) return list;
         Deque<TreeNode> deque = new LinkedList<TreeNode>();

         deque.add(root);
         while(!deque.isEmpty()){
             TreeNode t = deque.pop();
             list.add(t.val);
             if(t.left != null) deque.add(t.left);
             if(t.right != null) deque.add(t.right);
         }
         return list;
    }
}
