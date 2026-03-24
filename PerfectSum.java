class PerfectSum
{
    static int perfectSum(int[] arr, int target)
    {
        int n = arr.length;
        int[][] dp = new int[n + 1][target + 1];
        dp[0][0] = 1;
        for(int i = 1; i <= n; i++)
        {
            for(int j = 0; j <= target; j++)
            {
                dp[i][j] = dp[i - 1][j];
                if(j >= arr[i - 1])
                {
                    dp[i][j] += dp[i - 1][j - arr[i - 1]];
                }
            }
        }
        return dp[n][target];
    }
   public static void main(String[] args)
    {
        int[] arr = {1, 2, 3, 3};
        int target = 6;

        System.out.println(perfectSum(arr, target));
    }
}