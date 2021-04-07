class Solution {
    public boolean isAnagram(String s, String t) {
        var hmapS = new HashMap<Character,Integer>();
        var hmapT = new HashMap<Character,Integer>();
        if(s.length() != t.length())
            return false;
        
        for(int i = 0; i < s.length(); i++){
            if(hmapS.containsKey(s.charAt(i))){
                hmapS.put(s.charAt(i),hmapS.get(s.charAt(i))+1);
            }else{
                hmapS.put(s.charAt(i),1);
            }
            if(hmapT.containsKey(t.charAt(i))){
                hmapT.put(t.charAt(i),hmapT.get(t.charAt(i))+1);
            }else{
                hmapT.put(t.charAt(i),1);
            }
        }
        
        return hmapT.equals(hmapS);
    }
}
