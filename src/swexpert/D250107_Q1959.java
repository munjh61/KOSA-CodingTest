package swexpert;

import java.util.Scanner;

public class D250107_Q1959 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tNum = sc.nextInt();
        for (int t = 1; t <= tNum; t++) {
            int n = sc.nextInt();
            int m = sc.nextInt();
            int[] ai = new int[n];
            for (int i = 0; i < n; i++) {
                ai[i] = sc.nextInt();
            }
            int[] bj = new int[m];
            for (int i = 0; i < m; i++) {
                bj[i] = sc.nextInt();
            }
            int max = 0;
            int[] small;
            int[] big;
            if(n < m){
                small = ai;
                big = bj;
            } else {
                small = bj;
                big = ai;
            }
            int range = Math.abs(m - n);
            int smallsize = Math.min(m,n);
                for (int j = 0; j < range + 1; j++) {
                    int sum = 0;
                    for (int i = 0; i < smallsize; i++) {
                        sum += big[j + i] * small[i];
                    }
                    max = Math.max(sum, max);
                }
            System.out.println("#" + t + " " + max);
        }
    }
}
