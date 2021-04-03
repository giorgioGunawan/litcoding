class Solution {
    public int findMin(int[] nums) {
        int minVal = Integer.MAX_VALUE;
        for(int i = 0; i < nums.length; i++){
            if(nums[i] < minVal){
                minVal = nums[i];
            }
        }
        return minVal;
    }
}
