import java.util.*;
public class dpA5 {
    public static int helper(int [][]triangle) {
        int n = triangle.length;
        int dp[][] = new int[n+1][n+1];
        
        for(int level=n-1;level>=0;level--) {
            for(int j=0;j<=level;j++) {
                dp[level][j] = triangle[level][j] + Math.min(dp[level+1][j],dp[level+1][j+1]);
            }
        }
        return dp[0][0];
        
    }
    public static void main(String[] args) {
        int triangle[][] = {{2},{3,4},{6,5,7},{4,1,8,3}};
        System.out.println(helper(triangle));
    }
}
