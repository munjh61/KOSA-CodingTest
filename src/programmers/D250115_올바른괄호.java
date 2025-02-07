package programmers;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;

public class D250115_올바른괄호 {
    boolean solution(String s) {
        int count = 0;
        for(int i = 0 ; i < s.length() ; i++){
            char c = s.charAt(i);
            if(c=='('){
                count ++;
            } else {
                count --;
            }
            if(count < 0 ){
                return false;
            }
        }
        return count == 0;
    }
}
