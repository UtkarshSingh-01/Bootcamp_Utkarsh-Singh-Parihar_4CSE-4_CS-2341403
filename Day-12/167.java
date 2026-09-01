class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int[] arr = new int[2];
        for(int i=0,j=numbers.length-1;j>i;){
            if(numbers[i]+numbers[j]<target) i++;
            else if((numbers[i]+numbers[j])>target ) j--;
            else{
                arr[0]=i+1;
                arr[1]=j+1;
                return arr;
            }
        }
        return arr; 
    }
}
