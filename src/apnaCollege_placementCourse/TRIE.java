package apnaCollege_placementCourse;

public class TRIE {
	
	static class Node {
		Node[] children; 
		boolean eow;
		
		public Node() {
			children = new Node[26];  // a to z
			for (int i=0; i<26; i++) {
				children[i] = null;
			}
			eow = false; 
		}
	}
	
	public static Node root = new Node();
	
	// Insert in Trie -- O(L) - L : length of String 
	public static void insert(String word) {
		int level = 0; 
		int len = word.length(); 
		int idx = 0; 
		Node curr = root;
		
		for (int i=0; i<word.length(); i++) { // O(L)
			idx = word.charAt(i) - 'a';
			
			if (curr.children[idx] == null) {
				// add new node 
				curr.children[idx] = new Node();
			}
			
			if (i == word.length() - 1) {
				curr.children[idx].eow = true;
			}
			
			curr = curr.children[idx];
		}
	}
	
	// Search in Trie -- O(L) - L : length of string
	public static boolean search(String key) {
		Node curr = root;
		for (int i=0; i<key.length(); i++) {
			int idx = key.charAt(i) - 'a';
			Node ptr = curr.children[idx];
			
			if (ptr == null) {
				return false;
			}
			
			if (i == key.length()-1 && ptr.eow == false) {
				return false;
			}
			
			curr = curr.children[idx];
		}
		return true;
	}
	
	public static boolean wordBreak(String key) {
		if (key.length() == 0) {
			return true;
		}
		
		for (int i=1; i<=key.length(); i++) {
			String firstPart = key.substring(0, i);
			String secPart = key.substring(i);
			if (search(firstPart) && wordBreak(secPart)) {
				return true;
			}
		}
		return false;
	}
	
	public static boolean startsWith(String prefix) {
		Node curr = root; 
		
		for (int i=0; i<prefix.length(); i++) {
			int idx = prefix.charAt(i) - 'a';
			
			if (curr.children[idx] == null) {
				return false;
			}
			
			curr = curr.children[idx];
		}
		
		return true;
	}
	
	public static int countNode(Node root) {
		if (root == null) {
			return 0;
		}
		
		int count = 0;
		for (int i=0; i<26; i++) {
			if (root.children[i] != null) {
				count += countNode(root.children[i]);
			}
		}
		
		return count+1;
	}
	
	public static String ans = "";
	
	public static void longestWord(Node root, StringBuilder temp) {
		if (root == null) {
			return; 
		}
		
		for (int i=0; i<26; i++) {
			if (root.children[i] != null && root.children[i].eow == true) {
				temp.append((char) (i+'a'));
				if (temp.length() > ans.length()) {
					ans = temp.toString();
				}
				longestWord(root.children[i], temp);
				
				temp.deleteCharAt(temp.length()-1);
			}
		}
	}
	
	public static void main(String[] args) {
		/*
		String[] words = {"the", "a", "there", "their", "any"};
		
		for (String word : words) {
			insert(word);
			System.out.println("inserted " + word);
		}
		
		System.out.println("their -> " + search("their"));
		System.out.println("thee -> " + search("thee"));
		
		String key = "theathere";
		System.out.println(wordBreak(key));
		*/
		
		/*
		String words[] = {"apple", "mango", "man", "woman"};
		String prefix = "ma";
		
		for (int i=0; i<words.length; i++) {
			insert(words[i]);
		}
		
		System.out.println(startsWith(prefix));
		*/
		
		/*
		String str = "ababa";
		
		for (int i=0; i<str.length(); i++) {
			String suffix = str.substring(i);
			insert(suffix);
		}
		
		System.out.println(countNode(root));
		*/
		
		String words[] = {"a", "banana", "app", "appl", "ap", "apply", "apple"};
		for (int i=0; i<words.length; i++) {
			insert(words[i]);
		}
		
		longestWord(root, new StringBuilder(""));
		System.out.println(ans);
	}
}
