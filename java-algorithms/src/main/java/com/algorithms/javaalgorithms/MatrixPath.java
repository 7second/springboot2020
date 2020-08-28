package com.algorithms.javaalgorithms;

/**
 * @author yupanpan
 * @date 2020/8/28 23:49
 */
public class MatrixPath {

    /*
     * 给定一个矩阵m，从左上角开始每次只能向右或者向下走，最后到达右下角的位置，
     * 路径上所有的数字累加起来就是路径和，返回所有的路径中最小的路径和。
     * 例如：
     * 1 3 5 9
     * 8 1 3 4
     * 5 0 6 1
     * 8 8 4 0
     * 路径 1，3，1， 0,6，1，0 是所有路径中路径和最小的，所以返回12。
     * */
    /*
     * 计算方法
     * */

    public static int minPathSum(int [][] m) {

        if(m==null || m.length==0 || m[0]==null || m[0].length ==0) {
            return 0;
        }

        int row=m.length;
        int col=m[0].length;
        int[][] dp=new int[row][col];
        dp[0][0] = m[0][0];

        for(int i=1;i<row;i++) {
            dp[i][0] = dp[i-1][0]+m[i][0];
        }

        for(int j=1;j<col;j++) {
            dp[0][j] = dp[0][j-1]+m[0][j];
        }

        for(int i=1;i<row;i++) {
            for(int j=1;j<col;j++) {
                dp[i][j] = Math.min(dp[i-1][j], dp[i][j-1])+m[i][j];
            }
        }

        return dp[row-1][col-1];
    }


    /*
     * 创建一个 M*N的矩阵，并赋予行和列随机整数值，元素的取值范围在1-10之间。
     * */

    public static int[][] createMatrix(int m, int n) {

        int [][] matrix=new int[m][n];
        int seed=0;
        for(int i=0;i<m;i++) {
            for(int j=0;j<n;j++) {
                seed=(int) ((Math.random()*10)+1);
                matrix[i][j]=seed;
            }
        }

        return matrix;
    }


    /*
     * 输出矩阵
     * */
    public static void printMatrix(int[][] matrix) {
        for(int i=0;i<matrix.length;i++) {
            for(int j=0;j<matrix[0].length;j++) {
                System.out.print(matrix[i][j]+"\t");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        int[][] matrix=createMatrix(4,4);
        printMatrix(matrix);

        int sum=minPathSum(matrix);

        System.out.println("sum = "+sum);

    }

}
