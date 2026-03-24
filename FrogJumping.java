import java.util.*;
class FrogJumping
{
    public static int jump(int n,int heigth[])
    {
        int dp[]=new int[n];
        dp[0]=0;
        for(int i=1;i<n;i++)
        {
           int j1=dp[i-1]+Math.abs(heigth[i]-heigth[i-1]);
           int j2=Integer.MAX_VALUE;
           if(i>1)
           {
            j2=dp[i-2]+Math.abs(heigth[i]-heigth[i-2]);
             
           }
          dp[i]=Math.min(j1,j2);
        }
        return dp[n-1];
    }
    public static void main(String[] args)
    {
        int height[]={10,20,30,10};
        int n=height.length;
        System.out.println(jump(n,height));
    }
}