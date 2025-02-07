package swexpert;

import java.util.*;

public class D250105_Q1206 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        for (int t = 0; t < 10; t++) {
            List<Integer> list = new LinkedList<>();
            list.add(0);
            list.add(0);
            int n = sc.nextInt();
            for (int i = 0; i < n; i++) {
                list.add(sc.nextInt());
            }
            list.add(0);
            list.add(0);
            int sum = 0;
            for (int i = 2; i < n + 2; i++) {
                List<Integer> list2 = new ArrayList<>();
                for (int j = i - 2; j <= i + 2; j++) {
                    list2.add(list.get(j));
                }
                Collections.sort(list2);
                int top = list2.get(4);
                int second = list2.get(3);
                if (list.get(i) == top) {
                    sum += top - second;
                }
            }
            System.out.println("# "+ sum);
        }
    }
}
