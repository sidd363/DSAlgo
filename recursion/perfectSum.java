package recursion;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class perfectSum {
    public static int perfectSum(int arr[],int n, int sum)
    {
        // Your code goes here
        int [] tmp = new int[1];
        tmp[0] = 0;
        util(arr, n, sum, tmp, 0);
        return (int) (tmp[0] % (Math.pow(10, 9)+7));
    }

    private static void util(int[] arr, int n, int sum, int[] tmp, int start) {

        if(start==n) {
            if (sum == 0) {
                tmp[0]++;
            }
            return;
        }

        //for(int i = start; i<n; i++){
            util(arr, n, sum - arr[start], tmp, start+1);
            util(arr, n, sum, tmp, start+1);
        //}
    }


    public static void combinationSum(int arr[],int n, int sum)
    {
        // Your code goes here
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> ds = new ArrayList<>();
        Arrays.sort(arr);
        utilComb(arr, n, sum, ans, ds , 0);
        for(List<Integer> each : ans){
            for(int i : each){
                System.out.print(i + " //t ");
            }
            System.out.println("-----" );
        }

    }

    private static void utilComb(int[] arr, int n, int sum, List<List<Integer>> ans, List<Integer> ds, int start) {

        if (sum == 0) {
            ans.add(new ArrayList<>(ds));
            return;
        }

        for(int i = start; i< n; i++){
            if(i > start && arr[i] == arr[i-1]){
                continue;
            }
            ds.add(arr[i]);
            utilComb(arr, n, sum - arr[i], ans, ds , i+1);
            ds.remove(ds.get(ds.size()-1));
        }
    }




    private static void printUniqueSubset(int[] arr) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> ds = new ArrayList<>();
        Arrays.sort(arr);
        utilSubset2(arr, arr.length, ans, ds , 0);
        for(List<Integer> each : ans){
            for(int i : each){
                System.out.print(i + " //t ");
            }
            System.out.println("-----" );
        }
    }

    private static void utilSubset2(int[] arr, int length, List<List<Integer>> ans, List<Integer> ds, int start) {
        ans.add(new ArrayList<>(ds));

        for(int i = start; i< length; i++){
            if(i> start && arr[i]== arr[i-1]){
                continue;
            }
            ds.add(arr[i]);
            utilSubset2(arr, arr.length, ans, ds , i+1);
            ds.remove(ds.get(ds.size()-1));
        }
    }

    private static void subsetSum(int[] arr) {
        List<Integer> ds = new ArrayList<>();
        utilSubsetSum( arr.length, arr, ds , 0, 0);
        for(int i : ds){
            System.out.print(i + " //t ");
        }
        System.out.println("-----" );

    }



    private static void utilSubsetSum(int length, int[] arr, List<Integer> ds, int i, int sum) {
        if(i >= length){
            ds.add(sum);
            return;
        }


            utilSubsetSum( arr.length, arr, ds , i+1, sum+ arr[i]);
            utilSubsetSum( arr.length, arr, ds , i+1, sum);


    }

    public static List<List<Integer>> combinationSum3(int k, int sum) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> ds = new ArrayList<>();
        utilcombinationSum3(1, k, sum, ds, ans);
//        for(List<Integer> each : ans){
//            for(int i : each){
//                System.out.print(i + " //t ");
//            }
//        }
        System.out.println("-----" + ans.size()  );

        return ans;
    }

    private static void utilcombinationSum3(int i, int k, int sum, List<Integer> ds, List<List<Integer>> ans) {
        if(sum<0 || k<0 || i>9){
            return;
        }
        if(sum == 0 && k == 0){
            ans.add(new ArrayList<>(ds));
            return;
        }
        ds.add(i);
        utilcombinationSum3(i+1, k-1, sum -i, ds, ans);
        ds.remove(ds.get(ds.size()-1));
        utilcombinationSum3(i+1, k, sum, ds, ans);
    }

    public static List<String> letterCombinations(String digits) {
        List<String> ans = new ArrayList<>();
        StringBuilder sb = new StringBuilder("");
        String [] words = {"", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};

        utilPhoneLetter(ans, words, "", digits, 0);
//        for(String i : ans){
//            System.out.print(i + " //t ");
//        }
        System.out.println("-----" + ans.size()  );

        return ans;
    }

    private static void utilPhoneLetter(List<String> ans, String[] words, String sb, String digits, int start) {
        if(sb.length() == digits.length()){
            ans.add(sb);
            return;
        }
        if(start >= digits.length()) {
            return;
        }
        String word = words[digits.charAt(start)-'0'];
        System.out.println("word " + word);// abc, def
        for(int i = 0;i< word.length(); i++){

            utilPhoneLetter(ans, words, word.charAt(i)+sb, digits, start+1);
        }
    }

    private static void palindromePartioning(String str) {
        List<List<String>> ans = new ArrayList<>();
        List<String> ds = new ArrayList<>();

        utilPalindrome(str, ans, ds , 0);
//        for(List<String> each : ans){
//            for(String i : each){
//                System.out.print(i + " //t ");
//            }
//            System.out.println("-----" );
//        }
    }
    private static boolean isPalindrome(String str){
        int left = 0, right = str.length()-1;
       // if(str.equals("")) return true;
        while(left<=right){
            if(str.charAt(left++)!= str.charAt(right--)){
                return false;
            }
        }
        return true;
    }
    private static void utilPalindrome(String str, List<List<String>> ans, List<String> ds, int cutIndex) {
       if(cutIndex == str.length()){
        ans.add(new ArrayList<>(ds));
        return ;
 }
       for(int i = cutIndex; i<str.length();i++){
            String left = str.substring(cutIndex, i+1);
            if(!isPalindrome(left)){
                continue;
            }
            ds.add(left);
            utilPalindrome(str, ans, ds , i+1);
            ds.remove(ds.size()-1);
       }
    }
    private static boolean wordSearch(char[][] board, String word) {
        int m = board.length;
        int n = board[0].length;
        boolean [][] visited = new boolean[m][n];
        int index = 0;
        for(int i = 0;i<m;i++){
            for(int j = 0;j<n ; j++){
                if(word.charAt(index) == board[i][j]){
                    if (utilSearch(board, word, m , n, i, j, visited, index)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    private static boolean utilSearch(char[][] board, String word, int m, int n, int i, int j, boolean[][] visited, int wordIndex) {
        if(wordIndex == word.length()) return true;

        if(i<0 || j<0 || i>=m || j>=n || visited[i][j] == true || word.charAt(wordIndex) != board[i][j]) return false;


        visited[i][j] = true;
        boolean l =  utilSearch(board, word, m , n, i+1, j, visited, wordIndex+1);
        boolean r =  utilSearch(board, word, m , n, i-1, j, visited, wordIndex+1);
        boolean u = utilSearch(board, word, m , n, i, j+1, visited, wordIndex+1);
        boolean d =  utilSearch(board, word, m , n, i, j-1, visited, wordIndex+1);
        visited[i][j] = false;
        return  l || r || u|| d;

    }


    public static void main(String[] args) {
        int [] arr = {5,2,3,10, 6,8};
        int n = arr.length;
        //System.out.println(perfectSum(arr, n , 10));
        // combinationSum(new int[]{2,5,2,1,2}, 5, 5);
        //subsetSum(new int[]{1,2,5});
        //printUniqueSubset(new int[]{1,2,2});
        // combinationSum3(4, 1);
        // letterCombinations("234");
        //palindromePartioning("aab");
        String word = "ABCCEy";
        char [][] board = {
                {'A','B','C','E'},
                {'S','F','C','S'},
                {'A','E','E','D'}
        };
        char [][] b2 = {{'A','B','C','E'},{'S','F','C','S'},{'A','D','E','E'}};
        char [][] b3 = {{'A','B'}};
        char [][] b4 = {{'a','a'}};

//        System.out.println(wordSearch(board, word));
//        System.out.println(wordSearch(b2, "SEE"));
//        System.out.println(wordSearch(b3, "BA"));
//        System.out.println(wordSearch(b4, "aaa"));
        System.out.println("bae".compareTo("be"));

        // System.out.println("is p "+ isPalindrome("ab"));
        // 1 2 3 5 6 7 8
    }



}
