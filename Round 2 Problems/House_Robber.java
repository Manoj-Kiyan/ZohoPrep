public class House_Robber{
    public static void main(String[] args) {
        int[] arr={2,7,9,3,1};
        int ans = robAmount(arr);
        System.out.println("The Robbed amount is :"+ ans);
    }
    public static int robAmount(int[] nums) {
        if (nums.length == 0) return 0; 
        if (nums.length == 1) return nums[0];
       int dp[]=new int[nums.length];
       dp[0]=nums[0];
       dp[1]=Math.max(nums[0],nums[1]);

       for(int i=2;i<nums.length;i++){
            dp[i]=Math.max(dp[i-1],dp[i-2]+nums[i]);
       }
       return dp[nums.length-1];
    }

}
