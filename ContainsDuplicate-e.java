class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashSet<Integer> hSet = new HashSet<>();
        for(int i = 0; i < nums.length; i++){
            if(hSet.contains(nums[i])){
                return true;
            }else{
                hSet.add(nums[i]);
            }
        }
        return false;
    }
}
