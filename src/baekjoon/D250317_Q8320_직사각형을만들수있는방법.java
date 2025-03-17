package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class D250317_Q8320_직사각형을만들수있는방법 {

    static int[] arr = new int[10001];
    static int N;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        br.close();
        arr[1] = 1;
        calc(2);
        System.out.println(arr[N]);

    }
    static void calc(int idx){
        if(idx <= N){
            arr[idx] = arr[idx-1] + findYaksoo(idx);
            calc(idx+1);
        }

    }

    static int findYaksoo(int number){
        int cnt = 0;
        for(int i = 1 ; i*i <= number ; i++){
            if(number % i ==0)
                cnt++;
        }
        return cnt;
    }

}
