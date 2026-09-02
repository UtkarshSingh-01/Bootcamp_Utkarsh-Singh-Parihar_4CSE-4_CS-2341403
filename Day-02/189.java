public class Solution {
    public void rotate(int[] nums, int k) {
        k = k % nums.length; 
        int[] oldNums = nums.clone();
        for(int i = 0; i< nums.length;i++){
            nums[(i+k)%nums.length] = oldNums[i]; 
        }
    }
    
    public void reverse(int[] nums, int start, int end){
        while(start < end){
            int temp = nums[start]; 
            nums[start] = nums[end]; 
            nums[end]=temp; 
            start++; end--; 
        }
    }
}
