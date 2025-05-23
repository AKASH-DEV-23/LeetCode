class TrieNode {
    char val;
    boolean isWord;
    TrieNode[] children=new TrieNode[26];
    TrieNode(){}
    TrieNode(char c){
        TrieNode node = new TrieNode();
        node.val=c;
    }
}
class Trie {
    TrieNode root;
    Trie(){
        root=new TrieNode();
        root.val=' ';
    }
    public void insert(String word) {
        TrieNode ws=root;
        for(int i=0;i<word.length();i++){
            char c=word.charAt(i);
            if(ws.children[c-'a']==null){
                ws.children[c-'a']=new TrieNode(c);
            }
            ws=ws.children[c-'a'];
        }
        ws.isWord=true;
    }

    public boolean search(String word){
        TrieNode ws=root;
        for(int i=0;i<word.length();i++){
            char c=word.charAt(i);
            if(ws.children[c-'a']==null)    return false;
            ws=ws.children[c-'a'];
        }
        return ws.isWord;
    }
    
    public boolean startsWith(String prefix) {
        TrieNode ws=root;
        for(int i=0;i<prefix.length();i++){
            char ch=prefix.charAt(i);
            if(ws.children[ch-'a']==null)    return false;
            ws=ws.children[ch-'a'];
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