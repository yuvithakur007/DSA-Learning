//{ Driver Code Starts
import java.util.*;
import java.io.*;
import java.util.HashMap;

class GFG
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t > 0)
        {
            int n = sc.nextInt();
            int k = sc.nextInt();
            int a[] = new int[n];
            for (int i = 0; i < n; i++) 
                a[i] = sc.nextInt();
            Solution g = new Solution();
            
            ArrayList<Integer> ans = g.countDistinct(a, n, k);

            for (Integer val: ans) 
                System.out.print(val+" "); 
            System.out.println();
            t--;
        }
    }
}
// } Driver Code Ends


class Solution {
    public ArrayList<Integer> countDistinct(int A[], int n, int k) {
        ArrayList<Integer> result = new ArrayList<>();
        HashMap<Integer, Integer> countMap = new HashMap<>();
        int distinctCount = 0;
        for (int i = 0; i < k; i++) {
            if (countMap.getOrDefault(A[i], 0) == 0) {
                distinctCount++;
            }
            countMap.put(A[i], countMap.getOrDefault(A[i], 0) + 1);
        }
        result.add(distinctCount);
        for (int i = k; i < n; i++) {
            if (countMap.get(A[i - k]) == 1) {
                distinctCount--;
            }
            countMap.put(A[i - k], countMap.get(A[i - k]) - 1);

            if (countMap.getOrDefault(A[i], 0) == 0) {
                distinctCount++;
            }
            countMap.put(A[i], countMap.getOrDefault(A[i], 0) + 1);

            result.add(distinctCount);
        }
        return result;
    }
}