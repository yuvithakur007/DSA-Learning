//{ Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main(String[] args) throws IOException
	{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim());
        while(t-->0)
        {
            StringTokenizer stt = new StringTokenizer(br.readLine());
            
            int n = Integer.parseInt(stt.nextToken());
            int m = Integer.parseInt(stt.nextToken());
            int k = Integer.parseInt(stt.nextToken());
            int a[] = new int[(int)(n)];
            int b[] = new int[(int)(m)];
            
            
            String inputLine[] = br.readLine().trim().split(" ");
            for (int i = 0; i < n; i++) {
                a[i] = Integer.parseInt(inputLine[i]);
            }
            String inputLine1[] = br.readLine().trim().split(" ");
            for (int i = 0; i < m; i++) {
                b[i] = Integer.parseInt(inputLine1[i]);
            }
            
            
            Solution obj = new Solution();
            System.out.println(obj.kthElement( a, b, n, m, k));
            
        }
	}
}

// } Driver Code Ends


//User function Template for Java


class Solution {
    public long kthElement( int arr1[], int arr2[], int n, int m, int k) {
        
       int i = 0;
        int j = 0;
        int count = 0;

// Dont even have to merge , just iterate one by one and return 

// if (count == k) then return that element

        while (i < n && j < m) {
            if (arr1[i] < arr2[j]) {
                count++;
                if (count == k) {
                    return arr1[i];
                }
                i++;
            } else {
                count++;
                if (count == k) {
                    return arr2[j];
                }
                j++;
            }
        }

        // If we haven't found the kth element yet, we need to handle it here.
        while (i < n) {
            count++;
            if (count == k) {
                return arr1[i];
            }
            i++;
        }

        while (j < m) {
            count++;
            if (count == k) {
                return arr2[j];
            }
            j++;
        }

        return -1; // Return -1 if k is out of bounds.
        
        
    }
}

