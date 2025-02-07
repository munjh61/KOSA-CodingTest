package programmers;

import java.util.*;

public class D250113_같은숫자는싫어 {
    public int[] solution(int[] arr) {
        //큐 스택 문제인데 배열로 품
        /*
        List<Integer>list = new ArrayList<>();
        list.add(arr[0]);
        int size = arr.length;
        for(int i = 1 ; i < size ; i ++){
            if(arr[i-1]!=arr[i]){
                list.add(arr[i]);
            }
        }
        int ls = list.size();
        int[] answer = new int [ls];
        for(int i = 0 ; i < ls ; i++){
            answer[i] = list.get(i);
        }
        return answer;
         */
        // 스택으로 풀어보자
        Stack<Integer> stack = new Stack<>();
        for(int i : arr){
            if(stack.empty()){
                stack.push(i);
            } else if (stack.peek() != i) {
                stack.push(i);
            }
        }
        int size = stack.size();
        int[] answer = new int [size];
        for(int i = size -1 ; i >= 0 ; i--){
            answer[i] = stack.pop();
        }
        return answer;
    }
}

