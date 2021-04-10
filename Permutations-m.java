class Solution {
    public List<List<Integer>> permute(int[] nums) {
        ArrayList<Integer> tempList = new ArrayList<Integer>();
        ArrayList<List<Integer>> finalList = new ArrayList<List<Integer>>();
        backtrack(finalList, tempList, nums);
        return finalList;
    }
    
    private void backtrack(List<List<Integer>> finalList, List<Integer> tempList, int[] nums){
        
        if(tempList.size() == nums.length){
            // add to finalList
            finalList.add(new ArrayList<Integer>(tempList));
        }else{
            for(int i = 0; i < nums.length; i++){
                if(tempList.contains(nums[i])) continue;
                
                // if it doesnt contain, want to add it to tempList
                tempList.add(nums[i]);
                
                // and then backtrack again, 
                backtrack(finalList, tempList, nums);
                
                // after all the backtracking, tempList should be emptied 
                // (_, B, BO, BOA, BOAT, BOA, BO, B, _, O....)
                tempList.remove(tempList.size()-1);
            }
        }
    }
}
