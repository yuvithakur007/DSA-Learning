//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;
class GfG
{
    public static void main(String args[])
        {
            Scanner sc = new Scanner(System.in);
            int t = sc.nextInt();
            while(t-->0)
                {
                    int n = sc.nextInt();
                    int A[] = new int[n];
                    for(int i = 0;i<n;i++)
                        A[i] = sc.nextInt();
                    Solution ob = new Solution();
                    System.out.println(ob.minDifference(A,n));
                }
        }
}    
// } Driver Code Ends


//User function Template for Java

class Solution
{
 
public int minDifference(int nums[], int n) 
{ 
   if(nums.length==1) return nums[0];
   int memo[][]=new int[nums.length][Arrays.stream(nums).sum()];
   
   for(int i=0;i<nums.length;i++)
   Arrays.fill(memo[i],-1);
   
   
   
        int ans= minimumDifference(0,nums,0,0,0,0,memo);
        
 
        return ans;
        
    }
 
     public int minimumDifference(int i,int[] nums,int sum1,int sum2,int l1,int l2,int[][] memo) {
       if(l1==nums.length||l2==nums.length)
       return Integer.MAX_VALUE;
 
         if(i==nums.length){
             
          return Math.abs(sum1-sum2);
         }
 
        if(memo[i][Math.abs(sum1-sum2)]!=-1)
        return memo[i][Math.abs(sum1-sum2)];
 
        
        int ans1=minimumDifference(i+1,nums,sum1+nums[i],sum2,l1+1,l2,memo);
        int ans2=minimumDifference(i+1,nums,sum1,sum2+nums[i],l1,l2+1,memo);
         
       
 
        return memo[i][Math.abs(sum1-sum2)]=Math.min(ans1,ans2);
        
    }
 
}