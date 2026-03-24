class SubSetSum 
{
    static boolean isSubsetSum(int[] arr,int sums)
    {
        int n=arr.length;
        boolean[][] dp=new boolean[n+1][sums+1];
        for(int i=0;i<=n;i++)
        {
            dp[i][0]=true;
        }
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=sums;j++)
            {
                if(j<arr[i-1])
                {
                    dp[i][j]=dp[i-1][j];
                }
                else
                {
                    dp[i][j]=dp[i-1][j]||dp[i-1][j-arr[i-1]];
                }
            }
        }
        return dp[n][sums];
    }
    public static void main(String[] args)
    {
        int[] arr={3,34,4,12,5,2};
        int n=9;
        if(isSubsetSum(arr,n))
        {
        System.out.println("True");
        }
        else
        {
         System.out.println("False");
        }
    }
}