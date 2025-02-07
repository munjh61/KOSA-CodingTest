package baekjoon;

import java.util.Scanner;

public class D250203_Q1244_스위치켜고끄기 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int switchNum = sc.nextInt();
        boolean[] onoff = new boolean[switchNum];
        for (int i = 0; i < switchNum; i++) {
            int num = sc.nextInt();
            if (num == 1) {
                onoff[i] = true;
            }
        }
        int studentNum = sc.nextInt();
        for (int i = 0; i < studentNum; i++) {
            int gender = sc.nextInt();
            int number = sc.nextInt();
            //남자
            if (gender == 1) {
                for (int j = number - 1; j < switchNum; j += number) {
                    onoff[j] = !onoff[j];
                }
            } else { //여자
                int k = 1;
                onoff[number - 1] = !onoff[number - 1];
                while (true) {
                    if (number - 1 - k >= 0 && number - 1 + k < switchNum) {
                        if (onoff[number - 1 - k] == onoff[number - 1 + k]) {
                            onoff[number - 1 - k] = !onoff[number - 1 - k];
                            onoff[number - 1 + k] = !onoff[number - 1 + k];
                            k++;
                        }
                    } else {
                        break;
                    }
                }
            }
        }
        for(int i = 1 ; i <= switchNum ; i ++){
            if (i % 20 == 0){
                System.out.println();
            }
            if(onoff[i -1]){
                System.out.print(1 + " ");
            } else {
                System.out.print(0 + " ");
            }
        }
    }
}
