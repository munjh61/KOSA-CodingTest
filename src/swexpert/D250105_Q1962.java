package swexpert;

import java.util.Scanner;

public class D250105_Q1962 {
    static int n;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for(int tNum = 0 ; tNum < t ; tNum++){
            System.out.println("#"+(tNum+1));
            n = sc.nextInt();
            int [][] ary0 = new int [n][n];
            int[][] ary90 = new int [n][n];
            int[][] ary180 = new int [n][n];
            int[][] ary270 = new int [n][n];
            for(int i = 0 ; i < n ; i ++){
                for(int j = 0 ; j < n ; j ++){
                    int num = sc.nextInt();
                    ary0[i][j] = num;
                }
            }
            ary90 = turn90(ary0);
            ary180 = turn90(ary90);
            ary270 = turn90(ary180);
            for(int i = 0 ; i < n ; i++){
                String row90 = "";
                String row180 = "";
                String row270 = "";
                for(int j = 0 ; j < n ; j++){
                    row90 += ary90[i][j];
                    row180 += ary180[i][j];
                    row270 += ary270[i][j];
                }
                System.out.println(row90+" "+row180+" "+row270);
            }
        }
    }
    static int[][] turn90(int[][] aryIn){
        int aryOut [][]= new int[n][n];
        for(int i = 0 ; i < n ; i ++){
            for(int j = 0 ; j < n ; j ++){
                aryOut[j][n-1-i] = aryIn[i][j];
            }
        }
        return aryOut;
    }
}
