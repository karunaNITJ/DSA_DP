import java.util.*;
public class dpB4 {
    
    public static boolean SubsetEqual(int ind,int target,int arr[],int[][]dp) {
          if(target == 0) return true;
          if(ind == 0) return arr[0] == target;
        if(dp[ind][target] != -1) return dp[ind][target]==0?false:true;
          boolean notTaken = SubsetEqual(ind-1, target, arr,dp);
          boolean taken = false;
          if(target >= arr[ind]) {
            taken = SubsetEqual(ind-1, target-arr[ind], arr,dp);
          }
        dp[ind][target] = notTaken||taken?1:0;
          return notTaken||taken;
    }
    public static void main(String[] args) {
        int arr[] = {1,5,11,5};
        int n = arr.length;
        int sum = 0;
        for(int ele:arr)
        sum += ele;

        if(sum%2 != 0) {
            System.out.println("false");
            System.out.println("The array can't be partitioned into equal sum subsets:");
        }
      else {
        int target = sum/2;
        int dp[][] = new int[n][target+1];
        for(int []row:dp)
        Arrays.fill(row,-1);
        if(SubsetEqual(n-1, target, arr,dp)) {
            System.out.println("true");
            System.out.println("The array can be partitioned into equal subsets:- ");
        }
        else {
            System.out.println("false");
            System.out.println("The array can't be partitioned into equal sum subsets:");
        }
      }

    }
}
