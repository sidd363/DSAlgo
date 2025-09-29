package graphs;

public class PlacementOfStudents {
    /*static int ans = 0;
    public static int maxMatch(int[][] mat)
    {
        // Write your code here
        ans = 0;
        int noOfCandidates = mat.length;
        int noOffavJobs = mat[0].length;
        boolean[] jobAssignedArr = new boolean[noOffavJobs];
        int[] candidatePlacedArr = new int[noOfCandidates];
        Arrays.fill(candidatePlacedArr, -1);
        for(int i = 0;i< noOfCandidates;i++){
            if(candidatePlacedArr[i]== -1){
                dfs(jobAssignedArr, candidatePlacedArr, noOfCandidates, noOffavJobs, i, mat);
//                if(dfs(jobAssignedArr, candidatePlacedArr, noOfCandidates, noOffavJobs, i, mat)){
//                    //ans++;
//                }
            }
        }


        return ans;
    }

    private static boolean dfs(boolean[] jobAssignedArr, int[] candidatePlacedArr, int noOfCandidates, int noOffavJobs, int candidate, int[][] mat) {
        if( candidate < noOfCandidates && candidatePlacedArr[candidate]== -1) {
            for (int j = 0; j < noOffavJobs; j++) {
                if (mat[candidate][j] == 1 && jobAssignedArr[j] == false){
                    jobAssignedArr[j] = true;
                    candidatePlacedArr[candidate] = 1;
                    if(dfs(jobAssignedArr, candidatePlacedArr, noOfCandidates, noOffavJobs, candidate+1, mat)){
                        ans++;

                    }
                    return true;

                }
            }
        }
        return false;
    }
*/
    public static void main(String[] args) {
        int[][] grid = {{0, 0, 1, 1},
                {1, 1, 1, 1},
                {0, 0, 0, 1},
                {1, 0, 0, 0}};

        System.out.println(" max matched --> "+ maxMatch(grid));
    }



    private static boolean bipartiteMatch(int u, boolean[] visited, int[] assign, int[][] mat, int n)
    {

        // For all jobs 0 to N-1
        for (int v = 0; v < n; v++)
        {

            // When job v is not visited and u is interested
            if (mat[u][v] == 1 && !visited[v])
            {

                // Mark as job v is visited
                visited[v] = true;

                // When v is not assigned or previously assigned
                if (assign[v] < 0 || bipartiteMatch(assign[v], visited, assign, mat, n))
                {

                    // Assign job v to applicant u
                    assign[v] = u;

                    return true;
                }
            }
        }
        return false;
    }

    public static int maxMatch(int[][] mat)
    {
        int m = mat.length;
        int n = mat[0].length;

        // An array to track which job is assigned to which applicant
        int[] assign = new int[n];

        // Initially set all jobs are available
        for (int i = 0; i < n; i++)
        {
            assign[i] = -1;
        }

        int jobCount = 0;

        // For all applicants
        for (int u = 0; u < m; u++)
        {

            boolean[] visited = new boolean[n];

            // Initially no jobs are visited
            for (int i = 0; i < n; i++)
            {
                visited[i] = false;
            }

            // When u get a job
            if (bipartiteMatch(u, visited, assign, mat, n))
            {
                jobCount++;
            }
        }
        return jobCount;
    }
}



