package baekjoon;

import java.util.Scanner;

public class D250212_Q2527_직사각형 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		for (int i = 0; i < 4; i++) {
			// 직사각형1 좌표
			int x1 = sc.nextInt();
			int y1 = sc.nextInt();
			int p1 = sc.nextInt();
			int q1 = sc.nextInt();

			// 직사각형2 좌표
			int x2 = sc.nextInt();
			int y2 = sc.nextInt();
			int p2 = sc.nextInt();
			int q2 = sc.nextInt();

			// 1. 공통 부분이 없는 경우 (d)
			if (p1 < x2 || p2 < x1 || q1 < y2 || q2 < y1) {
				System.out.println("d");
			}
			// 2. 꼭짓점에서 만나는 경우 (c)
			else if ((p1 == x2 && q1 == y2) || (p1 == x2 && y1 == q2) ||
					(x1 == p2 && q1 == y2) || (x1 == p2 && y1 == q2)) {
				System.out.println("c");
			}
			// 3. 선분에서 만나는 경우 (b)
			else if (p1 == x2 || p2 == x1 || q1 == y2 || q2 == y1) {
				System.out.println("b");
			}
			// 4. 직사각형이 겹치는 경우 (a)
			else {
				System.out.println("a");
			}
		}
		sc.close();
	}
}
