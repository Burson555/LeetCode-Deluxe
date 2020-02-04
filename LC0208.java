// We don't have to store the string in the trie node.
// Using an array instead of a HashMap is much faster.
// Recall that if we have fixed number of keys in a HashMap,
//      we can replace it with an array to achieve better performance.

// Runtime: 32 ms, faster than 89.82% of Java online submissions for Implement Trie (Prefix Tree).
// Memory Usage: 54.1 MB, less than 32.69% of Java online submissions for Implement Trie (Prefix Tree).
// Runtime: 31 ms, faster than 95.72% of Java online submissions for Implement Trie (Prefix Tree).
// Memory Usage: 53.6 MB, less than 32.69% of Java online submissions for Implement Trie (Prefix Tree).
// Runtime: 32 ms, faster than 89.82% of Java online submissions for Implement Trie (Prefix Tree).
// Memory Usage: 54 MB, less than 32.69% of Java online submissions for Implement Trie (Prefix Tree).

class Trie {

    private boolean is_word;
    private Trie tt[];
    
    /** Initialize your data structure here. */
    public Trie() {
        this.is_word = false;
        this.tt = new Trie[26];
    }
    
    public boolean isWord() {
        return this.is_word;
    }
    
    public void setIsWord(boolean is_word) {
        this.is_word = is_word;
    }
    
    public Trie[] getDict() {
        return this.tt;
    }
    
    /** Inserts a word into the trie. */
    public void insert(String word) {
        Trie[] temp_dict = this.tt;
        Trie temp_trie = null;
        for (char c : word.toCharArray()) {
            if (temp_dict[c-'a'] == null)
                temp_dict[c-'a'] = new Trie();
            temp_trie = temp_dict[c-'a'];
            temp_dict = temp_trie.getDict();
        }
        temp_trie.setIsWord(true);
    }
    
    /** Returns if the word is in the trie. */
    public boolean search(String word) {
        Trie[] temp_dict = this.tt;
        Trie temp_trie = null;
        for (char c : word.toCharArray()) {
            if (temp_dict[c-'a'] == null)
                return false;
            temp_trie = temp_dict[c-'a'];
            temp_dict = temp_trie.getDict();
        }
        return temp_trie.isWord();
    }
    
    /** Returns if there is any word in the trie that starts with the given prefix. */
    public boolean startsWith(String prefix) {
        Trie[] temp_dict = this.tt;
        Trie temp_trie = null;
        for (char c : prefix.toCharArray()) {
            if (temp_dict[c-'a'] == null)
                return false;
            temp_trie = temp_dict[c-'a'];
            temp_dict = temp_trie.getDict();
        }
        for (int i = 0; i < 26; i++)
            if (temp_dict[i] != null)
                return true;
        return temp_trie.isWord();
    }
}

/**
 * Your Trie object will be instantiated and called as such:
 * Trie obj = new Trie();
 * obj.insert(word);
 * boolean param_2 = obj.search(word);
 * boolean param_3 = obj.startsWith(prefix);
 */


// // Runtime: 40 ms, faster than 49.97% of Java online submissions for Implement Trie (Prefix Tree).
// // Memory Usage: 53.7 MB, less than 32.69% of Java online submissions for Implement Trie (Prefix Tree).
// // Runtime: 39 ms, faster than 51.92% of Java online submissions for Implement Trie (Prefix Tree).
// // Memory Usage: 54 MB, less than 32.69% of Java online submissions for Implement Trie (Prefix Tree).

// class Trie {

//     private boolean is_word;
//     private HashMap<Character, Trie> ht;
    
//     /** Initialize your data structure here. */
//     public Trie() {
//         this.is_word = false;
//         this.ht = new HashMap<>();
//     }
    
//     public boolean isWord() {
//         return this.is_word;
//     }
    
//     public void setIsWord(boolean is_word) {
//         this.is_word = is_word;
//     }
    
//     public HashMap<Character, Trie> getDict() {
//         return this.ht;
//     }
    
//     /** Inserts a word into the trie. */
//     public void insert(String word) {
//         HashMap<Character, Trie> temp_dict = this.ht;
//         Trie temp_trie = null;
//         for (char c : word.toCharArray()) {
//             if (!temp_dict.containsKey(c))
//                 temp_dict.put(c, new Trie());
//             temp_trie = temp_dict.get(c);
//             temp_dict = temp_trie.getDict();
//         }
//         temp_trie.setIsWord(true);
//     }
    
//     /** Returns if the word is in the trie. */
//     public boolean search(String word) {
//         HashMap<Character, Trie> temp_dict = this.ht;
//         Trie temp_trie = null;
//         for (char c : word.toCharArray()) {
//             if (!temp_dict.containsKey(c))
//                 return false;
//             temp_trie = temp_dict.get(c);
//             temp_dict = temp_trie.getDict();
//         }
//         return temp_trie.isWord();
//     }
    
//     /** Returns if there is any word in the trie that starts with the given prefix. */
//     public boolean startsWith(String prefix) {
//         HashMap<Character, Trie> temp_dict = this.ht;
//         Trie temp_trie = null;
//         for (char c : prefix.toCharArray()) {
//             if (!temp_dict.containsKey(c))
//                 return false;
//             temp_trie = temp_dict.get(c);
//             temp_dict = temp_trie.getDict();
//         }
//         return (temp_dict.keySet().size() != 0) || temp_trie.isWord();
//     }
// }

// /**
//  * Your Trie object will be instantiated and called as such:
//  * Trie obj = new Trie();
//  * obj.insert(word);
//  * boolean param_2 = obj.search(word);
//  * boolean param_3 = obj.startsWith(prefix);
//  */