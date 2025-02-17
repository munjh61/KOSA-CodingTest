package baekjoon;

import java.util.Scanner;

public class D250217_Q2563_색종이2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        boolean[][] table = new boolean[100][100];
        // table[0][0] => (0,0) ~(1,1) 정사각형이라고 생각하자
        // 본인이 칠해져있을 때
        // 동서남북으로 색칠되어있는 사각형 갯수만큼 검은색 영역의 둘레 길이가 작아진다

        //색칠하기
        for (int paper = 0; paper < N; paper++) {
            int col = sc.nextInt();
            int row = sc.nextInt();
            for (int i = 0; i < 10; i++) {
                for (int j = 0; j < 10; j++) {
                    table[row+i][col+j] = true;
                }
            }
        }
        // 본인 & 동서남북 확인
        int[][] cnt = new int[100][100];
        for (int i = 0; i < 100; i++) {
            for (int j = 0; j < 100; j++) {
                if (table[i][j]) {
                    // 북
                    if (i - 1 < 0) {
                        cnt[i][j]++;
                    } else if (!table[i - 1][j]) {
                        cnt[i][j]++;
                    }
                    // 서
                    if (j - 1 < 0) {
                        cnt[i][j]++;
                    } else if (!table[i][j - 1]) {
                        cnt[i][j]++;
                    }
                    // 동
                    if (i + 1 >= 100) {
                        cnt[i][j]++;
                    } else if (!table[i + 1][j]) {
                        cnt[i][j]++;
                    }
                    //서
                    if (j + 1 >= 100) {
                        cnt[i][j]++;
                    } else if (!table[i][j + 1]) {
                        cnt[i][j]++;
                    }
                }
            }
        }
        int sum = 0;
        for (int[] row : cnt) {
            for (int elem : row) {
                sum += elem;
            }
        }
        System.out.println(sum);
        sc.close();
    }
}
