class Solution {
    public boolean isPalindrome(String s) {
        //var stack = new Stack<Character>();
        s = s.toUpperCase();
        var strB = new StringBuilder();
        var strS = new StringBuilder();
        for(int i = s.length()-1; i > -1; i--){
            if(Character.isLetter(s.charAt(i)) || Character.isDigit(s.charAt(i))){
                strB.append(s.charAt(i));
                strS.append(s.charAt(i));
            }
        }
        strS.reverse();
        System.out.println(strS);
        System.out.println(strB);
        
        return strB.toString().equals(strS.toString());
        
    }
}
