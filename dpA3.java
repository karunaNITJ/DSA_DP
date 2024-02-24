import java.util.*;
public class dpA3 {
    public static int rob(int n,int arr[]) {
        int dp[] = new int[n];
        dp[0] = arr[0];
        if(n==1) return arr[0];
        dp[1] = Math.max(arr[0],arr[1]);
        for(int i=2;i<n;i++) {
            dp[i] = Math.max(arr[i]+dp[i-2],dp[i-1]);
        }
        System.out.println(Arrays.toString(dp));
       return dp[n-1];
    }
    public static void main(String[] args) {
        int rs[] = {2,7,9,3,1};
       int n = rs.length;
       System.out.println("MAx Ammount:- "+rob(n,rs));
    }
}
