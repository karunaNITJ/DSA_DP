public class dpA1 {
    public static void main(String[] args) {
        int n = 5, m = 3;
        int dp[] = new int[n+1];
        dp[0] = 1;
        dp[1] = 1;
        for(int i=2;i<=n;i++) {
            for(int j=1;j<=m&&j<=i;j++) dp[i] += dp[i-j];
        }
        System.out.println("Number of Ways is:-> "+dp[n-1]);
    }
}
