class MinimumPathSum
{
    public static int minPathSum(int[][] grid)
    {
        int m = grid.length;
        int n = grid[0].length;
        int[] dp = new int[n];
        dp[0] = grid[0][0];
        for(int j = 1; j < n; j++)
        {
            dp[j] = dp[j - 1] + grid[0][j];
        }
        for(int i = 1; i < m; i++)
        {
            dp[0] = dp[0] + grid[i][0];
            for(int j = 1; j < n; j++)
            {
                dp[j] = grid[i][j] + Math.min(dp[j], dp[j - 1]);
            }
        }
        return dp[n - 1];
    }
    public static void main(String[] args)
    {
        int[][] grid = {
            {1,3,1},
            {1,5,1},
            {4,2,1}
        };
        int result = minPathSum(grid);
        System.out.println("Minimum Path Sum = " + result);
    }
}