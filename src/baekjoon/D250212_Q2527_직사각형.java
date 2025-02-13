package baekjoon;

import java.util.Scanner;

public class D250212_Q2527_직사각형 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < 4; i++) {
			// 직사각형1
			int x1 = sc.nextInt();
			int y1 = sc.nextInt();
			int p1 = sc.nextInt();
			int q1 = sc.nextInt();
			int ho1 = p1 - x1; // 가로
			int ve1 = q1 - y1; // 세로
			// 직사각형2
			int x2 = sc.nextInt();
			int y2 = sc.nextInt();
			int p2 = sc.nextInt();
			int q2 = sc.nextInt();
			int ho2 = p1 - x1; // 가로
			int ve2 = q1 - y1; // 세로

			int cx1 = (x1 + p1) / 2;
			int cy1 = (y1 + q1) / 2;
			int cx2 = (x2 + p2) / 2;
			int cy2 = (y2 + q2) / 2;

			int l = (cx2 - cx1) * (cx2 - cx1) + (cy2 - cy1) * (cx2 - cx1);
			int d = (ho2 - ho1) * (ho2 - ho1) + (ve2 - ve1) * (ve2 - ve1);
			if(l > d) {
				System.out.println("d");
			} else if (l == d) {
				System.out.println("c");
			} else {
				//선분인경우
				
				//포함하는 경우
				
			}
		}
		sc.close();

	}
}
