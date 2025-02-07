package programmers;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class D250117_프로세스 {
    public int solution(int[] priorities, int location) {
        Queue<Integer> queue = new LinkedList<>();
        for(int elem : priorities){
            queue.add(elem);
        }
        Arrays.stream(priorities).sorted();
        int nowlocation = 0;


        int answer = 0;
        return answer;
    }
}
