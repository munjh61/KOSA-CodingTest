package programmers;

import java.util.*;

public class D250111_완주하지못한선수 {
    public String solution(String[] participant, String[] completion) {
//        List<String>ary = new ArrayList<>(Arrays.asList(participant));
//        for(String c : completion){
//            ary.remove(c);
//        }
//        return ary.get(0);
        //느려
        Map<String, Integer>map = new HashMap<>();
        for(String elem : participant){
            map.put(elem,map.getOrDefault(elem,0)+1);
        }
        for(String elem : completion){
            map.put(elem,map.get(elem)-1);
        }
        for(String key : map.keySet()){
            if(map.get(key) != 0){
                return key;
            }
        }
        return "";
    }
}
