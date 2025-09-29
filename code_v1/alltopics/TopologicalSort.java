
import java.util.*;
class TopologicalSort
{
    static int[] topoSort(ArrayList<ArrayList<Integer>> list, int N)
    {
       // add your code here
       Stack<Integer> st = new Stack<Integer>();
       boolean[] visited = new boolean[N];
       // 0 -[]
      // 1-[]
       //2-[3]
       //3-[4]
       //4-[0,1]
       //5-[2,0]
       //visited
       
       for(int p =0;p<N;p++){
           if(!visited[p]){
                topoutil(st,visited, list,N, p);
           }
       }

       int[] ans = new int[N];
       int k = N-1;
       //System.out.println(" st size"+ st.size() + " \t"+ st);
       while(!st.isEmpty()){
      		ans[k]=st.pop();
      		//System.out.print(" stack ele "+ ans[k] + " k \t"+k);
      		k--;
      	   
      	//	k++;
       		
           
      }
      // System.out.println();
       return ans;
       // add to stack current index after visiting all adjacent vertices of that index in graph
       // but add to visited boolean array
      
       
       
    }

    private static void topoutil(Stack<Integer> st, boolean[] visited, ArrayList<ArrayList<Integer>> list, int n , int i){

    	visited[i] = true;
    	ArrayList<Integer> edgelist = list.get(i);
    	for(int j=0;j<edgelist.size();j++){
       		
       		int ele = edgelist.get(j);
            if(!visited[ele]){
       			topoutil(st, visited, list,n,ele);
       		}

        }
        st.push(i);

    }
}
