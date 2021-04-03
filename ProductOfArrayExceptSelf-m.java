class Solution {
    public int[] productExceptSelf(int[] nums) {
        int productOfAll = 1;
        int hasZero = 0;
        int[] result = new int[nums.length];
        for(int i=0; i < nums.length; i++){
            if(nums[i] != 0){
                productOfAll *= nums[i];
            }else{
                hasZero += 1;
            }
        }
        
        for(int i = 0; i < nums.length; i++){
            if(nums[i] != 0 && hasZero == 0){
                result[i] = productOfAll / nums[i];
            }else if(nums[i] != 0 && hasZero == 1 || hasZero >= 2){
                result[i] = 0;
            }else if(nums[i] == 0 && hasZero == 1){
                result[i] = productOfAll;
            }
        } 
        return result;
    }
}
