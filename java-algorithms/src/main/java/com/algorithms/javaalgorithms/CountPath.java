package com.algorithms.javaalgorithms;

/**
 * @author yupanpan
 * @date 2020/8/28 23:06
 */
public class CountPath {

    /*
     * 走方格问题：从左上角走到右下角的路径数量
     * 当只有1个格子时：可以看作m=n=1时，其实没有可走的路径，记为0；
     * 当只有2个格子时，无论是横着放置，还是竖着放置，路径数一样的。
     * 为什么？横着放置时，表示只能一直从左向右走；
     * 竖着放置时，表示只能一直从上向下走。
     * 当有4个格子时：可走的路径为2.
     * 当有6个格子时，可走的路径为3.
     * 找找规律。
     */
    public static int countMatrixPath(int m, int n) {

        /*
         * 开辟一个动态数组dp;dp数组的大小和原方格大小相同。
         * 定义dp[i][j]表示从左上角的格子（原点或者起点）走到nums[i][j]的格子共有多少种走法。
         * 首先分析题目的状态转移方程：因为机器人只能向右或向下走，
         * 对于非边界的每一个格子nums[i][j],都有:dp[i][j]=dp[i-1][j]+dp[i][j-1]
         * 然后考虑边界条件:
         * 当i=0时,机器人只能向右走,
         * 当j=0时,只能向下走,
         * 所以对于边界点nums[i][j]有,
         * 当i=0时,有dp[i][j]=dp[i][j-1];(表示当前位置是从左向右走过来的)
         * 当j=0时,有dp[i][j]=dp[i-1][j];(表示当前位置是从上向下走过来的)
         *
         * */
        int[][] dp = new int[m][n];

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {

                if (i != 0 || j != 0) {// 避免i,j同时为0,数组下标越界
                    if (i == 0) {//边界条件：表示从左向右走
                        dp[i][j] = dp[i][j - 1];
                    }
                    else if (j == 0) {//边界条件：表示从上向下走
                        dp[i][j] = dp[i - 1][j];
                    }
                    else {
                        //对于非边界上的格子
                        dp[i][j] = dp[i][j - 1] + dp[i - 1][j];
                    }
                } else
                    dp[i][j] = 1;

            }
        }
        //根据dp[i][j]的定义，其表示从左上角的格子（起点）走到nums[i][j]的格子共有多少种走法。
        //返回dp[m-1][n-1]的值。
        return dp[m - 1][n - 1];

    }

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        int M = 4;
        int N = 3;

        int numbersofPath = countMatrixPath(M, N);
        System.out.println("Numbers of Path is: " + numbersofPath);

    }

}
