class PrefixTree {
    private PrefixTree[] children;
    private boolean isEnd;

    public PrefixTree() {
       children = new PrefixTree[26];
       isEnd = false;  
    }

    public void insert(String word) {
        PrefixTree node = this;
        for (char c : word.toCharArray()){
            int index = c - 'a';
            if(node.children[index] == null){
                node.children[index] = new PrefixTree();
            }
            node = node.children[index];
        }
        node.isEnd = true;
    }

    public boolean search(String word) {
          PrefixTree node = searchNode(word);
          return node != null && node.isEnd;
    }

    public boolean startsWith(String prefix) {
         return searchNode(prefix) != null;
    }

    private PrefixTree searchNode(String s){
        PrefixTree node = this;
        for (char c: s.toCharArray()){
            int index = c - 'a';
            if (node.children[index] == null){
                return null;
            }

            node = node.children[index];
        }
        return node;
    }
}
