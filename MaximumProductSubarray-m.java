class Solution {
    public int maxProduct(int[] nums) {
        
        int maxSubarray = nums[0];
        for(int i = 0; i < nums.length; i++){
            int curSubarray = 1;
            for(int j = i; j < nums.length; j++){
                curSubarray *= nums[j];
                maxSubarray = Math.max(curSubarray,maxSubarray);
                
                if(curSubarray == 0){
                    curSubarray = 1;
                }
            }
        }
        return maxSubarray;
    }
}
