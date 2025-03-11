package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;

public class D250311_Q3052_나머지 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Set<Integer> set = new HashSet<>();
		for (int tc = 1; tc <= 10; tc++) {
			set.add(Integer.parseInt(br.readLine()) % 42);
		}
		br.close();
		System.out.println(set.size());
	}
}
