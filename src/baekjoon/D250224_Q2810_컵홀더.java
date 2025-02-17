package baekjoon;

import java.util.Scanner;

public class D250224_Q2810_컵홀더 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //커플석 LL 이 한번까진 괜찮다.
        //LL이 두번째부터는 컵 홀더가 없는 사람이 한명은 생긴다
        int N = sc.nextInt();
        String M = sc.next();
        int LL = (N - M.replace("LL","").length()) / 2;

        if(LL <= 1)
            System.out.println(N);
        else {
            System.out.println(N - LL + 1);
        }
    }
}
