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
            String[] s = br.readLine().trim().split(" ");
            int n = Integer.parseInt(s[0]);
            int[][] grid = new int[n][n];
            for(int i = 0; i < n; i++){
                String[] S = br.readLine().trim().split(" ");
                for(int j = 0; j < n; j++){
                    grid[i][j] = Integer.parseInt(S[j]);
                }
            }
            Solution obj = new Solution();
            int ans = obj.minimumCostPath(grid);
            System.out.println(ans);
        }
    }
}
// } Driver Code Ends


class tuple{
    int i,j,d;
    tuple(int a,int b,int c){
       i=a;
       j=b;
       d=c;
    }
}
class Solution
{
    //Function to return the minimum cost to react at bottom
    //right cell from top left cell.
    
    public int minimumCostPath(int[][] grid)
    {
        // Code here
        int m=grid.length;
        int n=grid[0].length;
        int[][] dis=new int[m][n];
        for(int i=0;i<m;i++){
             Arrays.fill(dis[i],(int)1e9);
        }
        dis[0][0]=grid[0][0];
        PriorityQueue<tuple> pq=new PriorityQueue<>((x,y)->x.d-y.d);
        pq.add(new tuple(0,0,dis[0][0]));
        int drow[]={-1,0,1,0};
        int dcol[]={0,1,0,-1};
        while(!pq.isEmpty()){
            tuple t=pq.poll();
            int r=t.i;
            int c=t.j;
            int cost=t.d;
            for(int k=0;k<4;k++){
                int mr=r+drow[k];
                int nc=c+dcol[k];
                if(mr>=0 && mr<m && nc>=0 && nc<n ){
                    if(cost+grid[mr][nc]<dis[mr][nc]){
                        dis[mr][nc]=cost+grid[mr][nc];
                        pq.add(new tuple(mr,nc,dis[mr][nc]));
                    }
                }
            }
        }
        return dis[m-1][n-1];
    }
}

