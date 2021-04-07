class Solution {
    public int lengthOfLongestSubstring(String s) {
        
        // METHOD 1 ----------------------------------
        int max = 0;
        int j = 0;
        int i = 0;
        HashSet<Character> set = new HashSet<Character>();
        
        while(j < s.length()){
            if(!set.contains(s.charAt(j))){
                set.add(s.charAt(j++));
                max = Math.max(max, set.size());
            }else {
                set.remove(s.charAt(i++));
            } 
        }      
        return max;
        
        // METHOD 2 ----------------------------------
        /*
        int max = 0
        for(int i = 0; i < s.length(); i ++){
            int tempMax = 0;
            HashSet<Character> set = new HashSet<Character>();
            for(int j = i; j < s.length(); j++){
                if(set.contains(s.charAt(j)))
                    break;
                set.add(s.charAt(j));
                tempMax++;
                max = max > tempMax? max:tempMax;
            }
        }
        return max;
        */

    }
}
