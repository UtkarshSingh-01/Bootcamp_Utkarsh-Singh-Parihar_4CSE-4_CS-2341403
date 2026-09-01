import java.util.*;
class Solution {
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> result = new ArrayList<>();
        if (root == null) 
        {return result;}
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        while (!q.isEmpty()) {
            int n = q.size(); 
            List<Integer> lvl = new ArrayList<>();
            for (int i = 0; i < n; i++) {
                TreeNode node = q.poll();
                lvl.add(node.val);
                if (node.left != null) 
                {q.add(node.left);}
                if (node.right != null) 
                {q.add(node.right);}
            }
            result.add(lvl);
        }
        return result;
    }
}
