package trie;
import java.util.*;

public class succ {
	class trie{
		
		class TrieNode{
			boolean end;
			TrieNode [] child;
			TrieNode(){
				child = new TrieNode[26];
				end = false;
			}
		}
		
		TrieNode root = new TrieNode();
		public void insert(String word) {
			TrieNode node = root;
			System.out.println(" while insert --- > "+ word);
			for(char c : word.toCharArray()) {
				if(node.child[c-'a']==null) {
					node.child[c-'a'] = new TrieNode();
				}
				node = node.child[c-'a'];
			}
			node.end= true;
		}
		
        public List<String> totalFindLength(String word) {
        		TrieNode node = root;
        		int count=0;
        		List<String>  al  = new ArrayList<String>();
        		StringBuilder  ans = new StringBuilder("");
			for(char c : word.toCharArray()) {
				System.out.println(" c  in totoal find lenght "+ c);
				if(node.child[c-'a']==null ||(node!=null && node.end) ) {
					System.out.println(" ans "+ ans );
					if(node.end) {
					    	al.add(String.valueOf(count));
						al.add(ans.toString());
				    }else {
					    	al.add(String.valueOf(0));
					    	al.add("");
				    }
					return al;
				}
				count++;
				ans.append(c);
				node = node.child[c-'a'];
			}
			
		    if(node.end) {
			    	al.add(String.valueOf(count));
				al.add(ans.toString());
		    }else {
			    	al.add(String.valueOf(0));
			    	al.add("");
		    }
			return al;
		}
	}
    public  String replaceWords(List<String> dict, String sentence) {
        StringBuilder  ans = new StringBuilder("");
        trie t = new trie();
        
        for(String word: dict) {
	    		t.insert(word);
	    }
        for(String word: sentence.split(" ")) {
        	System.out.println(" word "+ word );
        		List<String> c = t.totalFindLength(word);
        		String count = c.get(0);
        		String w = c.get(1);
        		if(count.equals("0")  ) {
        			ans.append(word);
        		}else {
        			ans.append(w);
        		}
        		ans.append(" ");
        }
        
        return ans.toString();
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		succ sc = new succ();
		System.out.println(sc.replaceWords(new ArrayList<String>(Arrays.asList("cat", "ba",  "rat", "ra")), "the cattle was rattled by the battery"));
	}

}
