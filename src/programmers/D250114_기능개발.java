package programmers;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class D250114_기능개발 {
    public int[] solution(int[] progresses, int[] speeds) {
        Queue<Integer> queue = new LinkedList<>();
        int pl = progresses.length;
        int[] days = new int[pl];
        for(int i = 0 ; i < pl ; i++){
            int day = (int) Math.ceil( (100.0 - progresses[i]) / speeds[i] );
            queue.add(day);
        }
        List<Integer> list = new ArrayList<>();
        while (!queue.isEmpty()){
            int num = 1;
            int q1 = queue.poll();
            while (!queue.isEmpty()){
                int q2 = queue.peek();
                if(q1>=q2){
                    queue.poll();
                    num++;
                    continue;
                }
                break;
            }
            list.add(num);
        }
        int size = list.size();
        int[] answer = new int[size];
        for(int i = 0 ; i < size ; i ++){
            answer[i]=list.get(i);
        }
        return answer;
    }
}
