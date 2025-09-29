package trie;
import java.util.*;
public class longWordDic {
	trienode root= new trienode() ; 
	class trienode{
		boolean end = false;
		trienode [] childs = new trienode[26];
	}
	
	
	
	public void insert(String word) {
		trienode node = root;
		for(char c : word.toCharArray()) {
			if(node.childs[c-'a']==null) {
				node.childs[c-'a'] = new trienode();
			}
			node = node.childs[c-'a'];
		}
		node.end = true;
	}
	
	public boolean find(String word) {
		trienode node = root;
		for(char c : word.toCharArray()) {
			if(node.childs[c-'a']==null) {
				return false;
			}
			node = node.childs[c-'a'];
		}	
		
		return node.end;
	}
	public  String longestWord(String[] words) {
		String ans = "";
		Arrays.sort(words);
		for(String word: words) {
			
			if(word.length()==1) {
			   insert(word);
			}else {
				// check if prefix exists or not 
				String prefix = word.substring(0, word.length()-1);
				//System.out.println(" prefic "+ prefix);
				
				if(find(prefix)){
					insert(word);
					
					if(word.length()>ans.length() || (word.length()==ans.length() && ans.compareTo(word)>0)) {
						ans = word;
					}
				}
				//System.out.println(" all is well "+ find("apple"));
			}
		}
		//System.out.println(" all is  "+ ans);
        return ans;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		longWordDic ld = new longWordDic();
		//ld.root = new trienode();
		
		String [] words = new String[] {"w","wo","wor","worl", "world"};
		
		String ans = ld.longestWord(words);
		System.out.println(" longest word in dictionary -->> "+ ans);
	}

}
