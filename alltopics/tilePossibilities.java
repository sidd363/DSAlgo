import java.util.Arrays;

public class tilePossibilities {
	public static int count =0;
	
    public static int numTilePossibilities(String tiles) {
    	char [] ca = tiles.toCharArray();
    	count=0;
    	Arrays.sort(ca);
    	bt(new boolean[ca.length], ca);
        return count-1;
    }

	private static void bt(boolean[] used, char[] ca) {
		// TODO Auto-generated method stub
		count++; //counting
		for(int i=0;i<ca.length;i++) {
			//duplicate check while calculating permutations
			if(used[i] || (i>0 && ca[i]==ca[i-1] && !used[i-1])) {
				continue;
			}
			used[i]= true;
			bt(used, ca);
			used[i]= false;
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(numTilePossibilities("aab"));
	}

}
