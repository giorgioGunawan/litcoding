class Trie {

    /** Initialize your data structure here. */
    private Node root;
    public class Node{
        char val;
        HashMap<Character,Node> hMap;
        boolean isEnd;
        
        public Node(char value){
            this.val = value;
            hMap = new HashMap<Character,Node>();
        }
    }

    public Trie() {
        this.root = new Node(' ');
    }
    
    /** Inserts a word into the trie. */
    public void insert(String word) {
        var current = root;
        for(var ch:word.toCharArray()){
            if(!current.hMap.containsKey(ch)){
                current.hMap.put(ch, new Node(ch));
            }
            current = current.hMap.get(ch);
        }
        current.isEnd = true; // boolean value defaults to false
    }
    
    /** Returns if the word is in the trie. */
    public boolean search(String word) {
        var current = root;
        for(var ch:word.toCharArray()){
            if(!current.hMap.containsKey(ch)){
                return false;
            }
            current = current.hMap.get(ch);
        }
        if(!current.isEnd)
            return false;
        return true;
    }
    
    /** Returns if there is any word in the trie that starts with the given prefix. */
    public boolean startsWith(String prefix) {
        var current = root;
        for(var ch:prefix.toCharArray()){
            if(!current.hMap.containsKey(ch)){
                return false;
            }
            current = current.hMap.get(ch);
        }
        return true;
    }
}

/**
 * Your Trie object will be instantiated and called as such:
 * Trie obj = new Trie();
 * obj.insert(word);
 * boolean param_2 = obj.search(word);
 * boolean param_3 = obj.startsWith(prefix);
 */
