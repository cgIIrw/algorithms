package Algorithms_FOURTH_EDITION;

/**
 * Created by yin on 18/5/3.
 * 实现字典树。
 */
public class Trie {
    private TrieNode root;

    public Trie(TrieNode node) {
        root = node;
    }

    public void insert(String word) {
        TrieNode p = root;
        for (int i = 0; i < word.length(); i++) {
            int index = word.charAt(i) - 'a';
            if (p.next[index] == null) {
                p.next[index] = new TrieNode();
            }
            p = p.next[index];
        }
        p.bool = true;
    }

    private TrieNode find(String s) {
        TrieNode p = root;
        for (int i = 0; i < s.length(); i++) {
            int index = s.charAt(i) - 'a';
            if (p.next[index] == null) {
                return null;
            }
            p = p.next[index];
        }
        return p;
    }

    public boolean search(String s) {
        TrieNode p = find(s);
        return p != null && p.bool;
    }

    public boolean startsWith(String s) {
        TrieNode p = find(s);
        return p != null;
    }

    public static void main(String[] args) {
        TrieNode node = new TrieNode();
        Trie trie = new Trie(node);
        String[] test = new String[]{"asda", "asdaa", "grw", "joji"};
        for (String s : test) {
            trie.insert(s);
        }
        System.out.println(trie.search("asda"));
    }
}


class TrieNode {
    boolean bool;
    TrieNode[] next;
    TrieNode() {
        bool = false;
        next = new TrieNode[26];
    }
}
