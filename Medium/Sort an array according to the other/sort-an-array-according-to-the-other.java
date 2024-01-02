//{ Driver Code Starts
//Initial Template for Java

/*package whatever //do not write package name here */

import java.util.*;
import java.lang.*;
import java.io.*;

import java.util.HashMap; 
import java.util.Map; 
import java.util.Map.Entry; 


// } Driver Code Ends
//User function Template for Java

class Solution{
    public static int[] sortA1ByA2(int A1[], int N, int A2[], int M)
    {
        ArrayList<Integer>ls=new ArrayList<Integer>();
        int i;
        Arrays.sort(A1);
        for(i=0;i<=A1.length-1;i++){
            ls.add(A1[i]);
        }
        HashSet<Integer>ls1=new HashSet<Integer>();
        for(i=0;i<=A2.length-1;i++){
            ls1.add(A2[i]);
        }
        ArrayList<Integer>ans=new ArrayList<>();
        int j;
        for(i=0;i<=A2.length-1;i++){
            for(j=0;j<=A1.length-1;j++){
                if(A1[j]==A2[i]){
                    ans.add(A1[j]);
                }
            }
        }
        for(i=0;i<=A1.length-1;i++){
            if(!ls1.contains(A1[i])){
                ans.add(A1[i]);
            }
        }
        int ans1[]=new int[ans.size()];
        for(i=0;i<=ans.size()-1;i++){
            ans1[i]=ans.get(i);
        }
        return ans1;
    }
}



//{ Driver Code Starts.
class Main {
	public static void main (String[] args) {
		Scanner sc=new Scanner(System.in);
		
		int t=sc.nextInt();
		
		while(t-->0)
		{
		    int n=sc.nextInt();
		    int m=sc.nextInt();
		    int a1[]=new int[n];
		    int a2[]=new int[m];
		    
		    for(int i=0;i<n;i++)
		    a1[i]=sc.nextInt();
		    
		    for(int i=0;i<m;i++)
		    a2[i]=sc.nextInt();
		    Solution ob=new Solution();
		    a1 = ob.sortA1ByA2(a1,n,a2,m);
		    for(int x:a1)
		    System.out.print(x+" ");
		    
		    System.out.println();
		}
	}
	

}



// } Driver Code Ends