class Solution {
    public int maxSubArray(int[] nums) {
        int curSubarray = nums[0];
        int maxSubarray = nums[0];
        for(int i = 1; i < nums.length; i++){
            curSubarray = Math.max(curSubarray + nums[i], nums[i]);
            maxSubarray = Math.max(curSubarray, maxSubarray);
        }
        return maxSubarray;
    }
}
