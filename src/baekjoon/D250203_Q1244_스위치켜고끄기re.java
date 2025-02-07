package baekjoon;

import java.util.Scanner;

public class D250203_Q1244_스위치켜고끄기re {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int switchNum = sc.nextInt();
        int[] onoff = new int[switchNum];
        for (int i = 0; i < switchNum; i++) {
            onoff[i] = sc.nextInt();
        }
        int studentNum = sc.nextInt();
        for (int i = 0; i < studentNum; i++) {
            int gender = sc.nextInt();
            int number = sc.nextInt();
            //남자
            if (gender == 1) {
                for (int j = number - 1; j < switchNum; j += number) {
                    if (onoff[j] == 1) {
                        onoff[j] = 0;
                    } else {
                        onoff[j] = 1;
                    }
                }
            } else { //여자
                int k = 1;
                int index = number - 1;
                if (onoff[index] == 1) {
                    onoff[index] = 0;
                } else {
                    onoff[index] = 1;
                }

                while (true) {
                    if (index - k >= 0 && index + k < switchNum) {
                        if (onoff[index - k] == onoff[index + k]) {
                            if (onoff[index - k] == 1) {
                                onoff[index - k] = 0;
                                onoff[index + k] = 0;
                            } else {
                                onoff[index - k] = 1;
                                onoff[index + k] = 1;
                            }
                            k++;
                        } else {
                            break;
                        }
                    } else {
                        break;
                    }
                }
            }
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 1; i <= switchNum; i++) {
            sb.append(onoff[i - 1]).append(" ");
            if (i % 20 == 0 || i == switchNum) {
                System.out.println(sb.toString().trim());
                sb.setLength(0);
            }
        }
    }
}
