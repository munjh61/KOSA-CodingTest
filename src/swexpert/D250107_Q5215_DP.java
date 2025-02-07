package swexpert;

import java.util.Arrays;
import java.util.Scanner;

public class D250107_Q5215_DP {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tNum = sc.nextInt();
        for(int t = 1 ; t <= tNum ; t++){
            int n = sc.nextInt();
            int l = sc.nextInt();
            int [] dp = new int [l+1];
            for(int i = 0 ; i < n ; i ++){
                int taste = sc.nextInt();
                int calorie = sc.nextInt();
                for(int j = l ; j >= calorie ; j--){
                    dp[j] = Math.max(dp[j],dp[j-calorie]+taste);
                }
            }
            Arrays.sort(dp);
            System.out.println("#"+t+" "+dp[dp.length-1]);
        }
    }
}
