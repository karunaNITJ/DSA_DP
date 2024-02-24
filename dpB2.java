public class dpB2 {
    public static int HouseRobber(int arr[]) {
        int n = arr.length;
        int dp[] = new int[n];
        dp[0] = arr[0];
        dp[1] = Math.max(arr[0],arr[1]);

        for(int i=2;i<n;i++) {
            dp[i] = Math.max(arr[i]+dp[i-2],dp[i-1]);
        }

        return dp[n-1];
    }
    public static void main(String[] args) {
        int nums[] = {1,2,3,1};
        int n = nums.length;
        
       

        // Edge Condition :- 

        if(nums.length == 1) {
            //return nums[0];
            System.out.println("Max Ammount is:-> "+nums[0]);
        }

         else 
        { 
            int excludeFirst[] = new int[n];
            int excludeLast[] = new int[n];
        
        for(int i=0;i<n;i++) {
            if(i!=0) 
            excludeFirst[i] = nums[i];
            if(i!=n-1) 
            excludeLast[i] = nums[i];
          }
          int ammount1 = HouseRobber(excludeFirst);
          int ammount2 = HouseRobber(excludeLast);
      
      int ans = Math.max(ammount1,ammount2);
      System.out.println("Max Ammount is:-> "+ans); 
       }

      
    }
}
