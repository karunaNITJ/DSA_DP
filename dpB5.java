import java.util.*;
public class dpB5 {

    public static int denominations(int ind,int target,int coin[],int dp[][]) {
        if(ind==0) return target%coin[0]==0?1:0;
        if(dp[ind][target] != -1) return dp[ind][target];
        int notTaken = denominations(ind-1, target, coin, dp);
        int taken = 0;
        if(coin[ind] <= target)
         taken = denominations(ind, target-coin[ind], coin, dp);
        return dp[ind][target] = taken+notTaken;
    }
    public static void main(String[] args) {
        int coins[] = {1,2,5};
        int n = coins.length;
        int ammount = 5;
        int dp[][] = new int[n][ammount+1];
        for(int []row:dp)
        Arrays.fill(row,0);

        // Tabulation :- 
        //base case 
        for(int T=0;T<=ammount;T++) {
            dp[0][T] = (T%coins[0]==0)?1:0;
        }

        for(int ind = 1;ind<n;ind++) {
            for(int T=0;T<=ammount;T++) {
                int notTaken = dp[ind-1][T];
                int taken = 0;
                if(coins[ind] <= T)
                taken = dp[ind][T-coins[ind]];
                dp[ind][T] = notTaken+taken;
            }
        }

        System.out.println("Total ways to make up ammout :-> "+denominations(n-1, ammount, coins, dp));

        //TABULATION METHOD :-
        System.out.println("Total ways to make up ammout :-> "+dp[n-1][ammount]);
    }
}
