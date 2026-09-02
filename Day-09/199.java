class Solution {
    public List<Integer> rightSideView(TreeNode root) {
       List<Integer> nam = new ArrayList<>();
       if(root == null) return nam;
       Queue<TreeNode> q = new LinkedList<>();
       q.add(root);
       while(!q.isEmpty()){
            int n = q.size();
            List<Integer>lvl = new ArrayList<>();
            for(int i=0;i<n;i++){
                TreeNode a = q.poll();
                lvl.add(a.val);
                if(a.left!=null){q.add(a.left);}
                if(a.right!=null){q.add(a.right);}
    }
    nam.add(lvl.get(n-1));
}
return nam;
    }
}
