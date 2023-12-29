//{ Driver Code Starts
import java.util.*;
import java.lang.*;
import java.io.*;
class GFG
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine().trim());
        while(T-->0)
        {
            int n = Integer.parseInt(br.readLine().trim());
            String[] s = br.readLine().trim().split(" ");
            int[][] Intervals = new int[n][2];
            int j = 0;
            for(int i = 0; i < n; i++){
                Intervals[i][0] = Integer.parseInt(s[j]);
                j++;
                Intervals[i][1] = Integer.parseInt(s[j]);
                j++;
            }
            Solution obj = new Solution();
            int[][] ans = obj.overlappedInterval(Intervals);
            for(int i = 0; i < ans.length; i++){
                for(j = 0; j < ans[i].length; j++){
                    System.out.print(ans[i][j] + " ");
                }
            }
            System.out.println();
        }
    }
}

// } Driver Code Ends


class Solution
{
    public int[][] overlappedInterval(int[][] Intervals)
    {
        // Code here // Code here
        List<Integer> list=new ArrayList<>();
        Arrays.sort(Intervals , (a , b)-> Integer.compare(a[0] , b[0]));
        
        list.add(Intervals[0][0]);
        list.add(Intervals[0][1]);
        
        for(int i=1;i<Intervals.length;i++){
            if(list.get(list.size()-1) < Intervals[i][0]){
                list.add(Intervals[i][0]);
                list.add(Intervals[i][1]);
            }else if(list.get(list.size()-1) < Intervals[i][1]){
                list.set(list.size()-1 , Intervals[i][1]);
            }
        }
        
        int ans[][]=new int[list.size()/2][2];
        int k=0;
        for(int i=0;i<ans.length;i++){
            ans[i][0]=list.get(k++);
            ans[i][1]=list.get(k++);
        }
        
        return ans;
    }
}

