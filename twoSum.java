import java.util.ArrayList;
class Solution {
    public int[] twoSum(int[] nums, int target) {
        ArrayList<Integer> arr = new ArrayList<Integer>();
        for(int i = 0; i < nums.length; i++){
            if(arr.contains(nums[i])){
                return new int[]{arr.indexOf(nums[i]), i};
            }
            arr.add(target - nums[i]);
        }
        return null;   
    }
}
