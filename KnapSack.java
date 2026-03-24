class KnapSack
{
    static int knapsack(int w,int[] val,int[] wt)
    {
        int n=wt.length;
        int[][] dp=new int[n+1][w+1];
        for(int i=0;i<=n;i++)
        {
            for(int j=0;j<=w;j++)
            {
                if(i==0||j==0)
                    dp[i][j]=0;
                else{
                    int pick=0;
                    if(wt[i-1]<=j)
                        pick=val[i-1]+dp[i-1][j-wt[i-1]];
                    int notpick=dp[i-1][j];
                    dp[i][j]=Math.max(pick,notpick);
                }
            }
        }
        return dp[n][w];
    }
    public static void main(String[] args)
    {
        int val[]={3,2,4};
        int wt[]={3,5,4};
        int w=4;
        System.out.println(Dp6.knapsack(w,val,wt));
    }
}