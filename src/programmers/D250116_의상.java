package programmers;

import java.util.HashMap;
import java.util.Map;

public class D250116_의상 {
    public int solution(String[][] clothes) {
        Map<String,Integer> map = new HashMap<>();
        for(String[] elem : clothes){
            map.put(elem[1],map.getOrDefault(elem[1],0)+1);
        }
        int answer = 1;
        for(int value : map.values()){
            answer = answer * (value+1);
        }
        return answer - 1;
    }
}