package baekjoon;

import java.util.Scanner;

public class D250217_Q2798_블랙잭 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        int [] cards = new int[N];
        boolean [] choose = new boolean[N];
        for(int i = 0 ; i < N ; i++){
            cards[i] = sc.nextInt();
        }
        int max = 0;
        for(int i = 0 ; i < N ; i++){
            int sum = 0 ;
             for(int ii = i + 1 ; ii < N  ; ii++){
                 for(int iii = ii + 1 ; iii < N ; iii++){
                     sum = cards[i] + cards[ii] + cards[iii];
                     if(sum <= M && sum > max)
                         max = sum;
                 }
             }
        }
        System.out.println(max);
    }
}
