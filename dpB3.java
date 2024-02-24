import java.util.*;
public class dpB3 {
    // public static int minSumPath(int i,int j,int grid[][],int dp[][]) {
    //     if(i==0 && j==0) {
    //        return grid[i][j];
    //     }
    //     if(i<0 || j<0) return (int)1e9;
    //     if(dp[i][j] != -1) return dp[i][j];
    //   int up = grid[i][j] + minSumPath(i-1, j, grid, dp);
    //   int left = grid[i][j] + minSumPath(i, j-1, grid, dp);
    //   return dp[i][j] = Math.min(up,left);
    //   //return dp[i][j];
    // }
    public static void main(String[] args) {
        int grid[][] = {{1,3,1},{1,5,1},{4,2,1}};
        int m = grid.length;
        int n = grid[0].length;        
        int dp[][] = new int[m][n];
        // for(int row[]:dp) {
        //     Arrays.fill(row,-1);
        // }

        for(int i=0;i<m;i++) {
            for(int j=0;j<n;j++) {
                if(i==0 && j==0) dp[i][j] = grid[0][0];
                else {
                    int up =   grid[i][j];
                    if(i>0) 
                    up += dp[i-1][j];
                    else 
                    up += (int)1e9;
                    int left = grid[i][j];
                    if(j>0) 
                     left += dp[i][j-1];
                     else 
                    left += (int)1e9;
                     dp[i][j] = Math.min(left,up);
                }
            }
        }
        System.out.println("Minimal cost is :-> "+dp[m-1][n-1]);
    }
}
