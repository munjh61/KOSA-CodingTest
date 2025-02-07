package swexpert;

import java.util.Scanner;

public class D250105_Q12712 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int tNum = 0; tNum < t; tNum++) {
            int n = sc.nextInt();
            int m = sc.nextInt() - 1;
            int[][] ary = new int[n][n];
            //값넣기
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    ary[i][j] = sc.nextInt();
                }
            }

            //비교
            int sum;
            int max;
            int maxtotal = 0;
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    //십자
                    //가로
                    sum = 0;
                    max = 0;
                    int left = Math.max(0, j - m);
                    int right = Math.min(n - 1, j + m);
                    for (int target = left; target <= right; target++) {
                        sum += ary[i][target];
                    }
                    //세로
                    int bottom = Math.max(i - m, 0);
                    int top = Math.min(i + m, n - 1);
                    for (int target = bottom; target <= top; target++) {
                        sum += ary[target][j];
                    }
                    sum -= ary[i][j];
                    max = Math.max(sum, max);
                    //X모양
                    sum = 0;
                    for (int d = -m; d <= m; d++) {
                        if (i + d >= 0 && j + d >= 0 && i + d <= n - 1 && j + d <= n - 1) {
                            sum += ary[i + d][j + d];
                        }
                        if (i + d >= 0 && j - d >= 0 && i + d <= n - 1 && j - d <= n - 1) {
                            sum += ary[i + d][j - d];
                        }
                    }
                    sum -= ary[i][j];
                    max = Math.max(sum, max);
                    maxtotal = Math.max(max, maxtotal);
                }
            }
            System.out.println(maxtotal);
        }
    }
}
