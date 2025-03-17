package etc;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SonJongLetter {
    static String[] letter;
    static int N; // 문자수
    static int M; // 글자길이

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("문자 수를 입력해주세요");
        N = Integer.parseInt(br.readLine());
        System.out.println("문자를 한 줄로 입력해주세요");
        letter = br.readLine().split("");
        while(true){
            System.out.println("문자 길이를 입력해주세요, 종료하려면 0을 누르세요");
            M = Integer.parseInt(br.readLine());
            if(M == 0)
                break;

        }
        br.close();

    }

    static void comb(){

    }
}
