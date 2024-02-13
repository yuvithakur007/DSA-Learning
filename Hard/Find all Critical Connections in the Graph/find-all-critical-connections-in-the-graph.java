//{ Driver Code Starts
//Initial Template for Java

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
            String[] s = br.readLine().trim().split(" ");
            int V = Integer.parseInt(s[0]);
            int E = Integer.parseInt(s[1]);
            ArrayList<ArrayList<Integer>>adj = new ArrayList<>();
            for(int i = 0; i < V; i++)
                adj.add(i, new ArrayList<Integer>());
            for(int i = 0; i < E; i++){
                String[] S = br.readLine().trim().split(" ");
                int u = Integer.parseInt(S[0]);
                int v = Integer.parseInt(S[1]);
                adj.get(u).add(v);
                adj.get(v).add(u);
            }
            Solution obj = new Solution();
            ArrayList<ArrayList<Integer>> ans = obj.criticalConnections(V, adj);
            for(int i=0;i<ans.size();i++)
                System.out.println(ans.get(i).get(0) + " " + ans.get(i).get(1));
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution
{
    public static int timer;
    public Solution(){
        timer=1;
    }
    public static void solve(int src,int parent,
    ArrayList<ArrayList<Integer>> adj,int V,ArrayList<ArrayList<Integer>> res,
    int[] tim,int[] low,int[] visited){
        visited[src]=1;
        tim[src]=low[src]=timer;
        timer++;
        for(int child:adj.get(src)){
            if(child==parent) continue;
            if(visited[child]==0){
                solve(child,src,adj,V,res,tim,low,visited);
                low[src]=Math.min(low[child],low[src]);
                // bridge condn
                if(low[child]>tim[src]){
                    ArrayList<Integer> temp=new ArrayList<>();
                    if(src<child){
                        temp.add(src);
                        temp.add(child);
                    }else{
                        temp.add(child);
                        temp.add(src);
                    }
                    res.add(new ArrayList<>(temp));
                }
            }else{
                low[src]=Math.min(low[src],low[child]);
            }
        }
    }
    public ArrayList<ArrayList<Integer>> criticalConnections(int V, ArrayList<ArrayList<Integer>> adj)
    {
        int[] tim=new int[V];
        int[] low=new int[V];
        int[] visited=new int[V];
        ArrayList<ArrayList<Integer>> res=new ArrayList<>();
        for(int i=0;i<V;i++){
            if(visited[i]==0)
            solve(i,-1,adj,V,res,tim,low,visited);
        }
        Collections.sort(res,(a1,a2)->{
            int x=a1.get(0)-a2.get(0);
            int y=a1.get(1)-a2.get(1);
            return x==0?y:x;
        });
        return res;
    }
}

