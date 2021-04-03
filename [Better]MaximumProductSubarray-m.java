class Solution {
    public int maxProduct(int[] nums) {
        
        int maxPos = 1;
        int maxNeg = 1;
        int max = nums[0];
        
        for(int i = 0; i < nums.length; i++){
            if(nums[i] > 0){
                maxPos = maxPos * nums[i];
                maxNeg = (maxNeg < 0) ? maxNeg*nums[i] : 1;
                max = (max > maxPos)? max: maxPos;
            }else if(nums[i] < 0){
                int temp = maxNeg;
                maxNeg = maxPos * nums[i];
                maxPos = (temp < 0)? temp * nums[i] : 1;
                max = (temp < 0)? ((max > maxPos)? max: maxPos):max; 
            }else{
                maxPos = 1;
                maxNeg = 1;
                max = (max < 0)? 0: max;
            }
        }
        return max;
    }
}
