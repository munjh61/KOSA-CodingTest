package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class D250310_Q24725_엠비티아이 {
    static String[][] matrix;
    static int N;
    static int M;
    static int cnt = 0;
    static int[] dRow = {-1, -1, -1, 0, 0, 1, 1, 1};
    static int[] dCol = {- 1, 0, 1, -1, 1, -1, 0, 1};
    static String[][] mbti = {{"I", "E"}, {"S", "N"}, {"T", "F"}, {"J", "P"}};

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // matrix 채워 넣기
        String[] line = br.readLine().split(" ");
        N = Integer.parseInt(line[0]);
        M = Integer.parseInt(line[1]);
        matrix = new String[N][M];
        for (int row = 0; row < N; row++) {
            matrix[row] = br.readLine().split("");
        }
        br.close();

        // 8방향으로 찾기
        for (int row = 0; row < N; row++) {
            for (int col = 0; col < M; col++) {
                for(int dir = 0 ; dir < 8 ; dir ++){
                    if(row + 3*dRow[dir] >= 0 && row + 3*dRow[dir] < N && col + 3*dCol[dir] >= 0 && col + 3*dCol[dir] < M){
                        mbtifind(row,col,dRow[dir],dCol[dir]);
                    }
                }
            }
        }
        System.out.println(cnt);
    }

    static void mbtifind(int row, int col, int dRow, int dCol) {
        int i = 0;
        for (; i < 4; i++) {
            if (matrix[row][col].equals(mbti[i][0]) || matrix[row][col].equals(mbti[i][1])) {
                row += dRow;
                col += dCol;
            } else {
                break;
            }
        }
        if (i == 4)
            cnt++;
    }
}
