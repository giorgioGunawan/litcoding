class Solution {
    public List<String> fizzBuzz(int n) {
        int i = 0;
        var listStr = new ArrayList<String>();
        String arr;
        String iStr;
        while(i < n ){
            i++;
            iStr = Integer.toString(i);
            arr = i % 3 == 0 ? (i % 5 == 0 ? "FizzBuzz":"Fizz") : (i % 5 == 0 ? "Buzz" :iStr);
            listStr.add(arr);
        }
        
        return listStr;
    }
}
