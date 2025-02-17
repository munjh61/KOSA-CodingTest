package baekjoon;

import java.util.Scanner;

public class D250217_Q2563_색종이 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[][] table = new int[100][100];
        for (int paper = 0; paper < N; paper++) {
            int col = sc.nextInt();
            int row = sc.nextInt();
            for(int i = 0 ; i < 10; i++){
                for(int j = 0 ; j < 10 ; j++){
                    table[row+i][col+j] = 1;
                }
            }
        }
        int sum = 0;
        for(int[] row : table){
            for(int elem : row){
                sum += elem;
            }
        }
        System.out.println(sum);
        sc.close();
    }
}
