class Solution {
    public int[][] merge(int[][] arr) {
        int n=arr.length;
        Arrays.sort(arr,(a,b)->a[0]-b[0]);
        ArrayList<int[]> res =new ArrayList<>();
        int start=arr[0][0];
        int end=arr[0][1];
        for(int i=0;i<n;i++){
            if(arr[i][0]<=end){
                end=Math.max(end,arr[i][1]);

            }
            else{
                res.add(new int[]{start ,end});
                start=arr[i][0];
                end=arr[i][1];
            }
        }
        res.add(new int[]{start ,end});
        return res.toArray(new int[res.size()][]);
        
    }
}
