package swexpert;

import java.util.*;

//같은 숫자가 있다면 오류 난다.
public class D250105_Q1244Failed {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tNum = sc.nextInt();
        for (int t = 0; t < tNum; t++) {
            //자리수 변환
            int num = sc.nextInt();
            String numS = String.valueOf(num);
            List<String> list = new LinkedList<>(Arrays.asList(numS.split("")));
            List<Integer> numDigit = new ArrayList<>();
            for (String elem : list) {
                numDigit.add(Integer.parseInt(elem));
            }
            //교체
            int change = sc.nextInt();
            w : while (change > 0) {
                int length = numDigit.size();
                List<Integer> sortDigit = findmax(numDigit);
                for (int i = 0; i < length; i++) {
                    if (sortDigit.get(i) != numDigit.get(i)) {
                        int target = numDigit.get(i);
                        int lastIndex = numDigit.lastIndexOf(sortDigit.get(i));
                        numDigit.set(i, sortDigit.get(i));
                        numDigit.set(lastIndex, target);
                        change--;
                        continue w;
                    }
                }
                //이미 최대값인데, 교환 횟수가 남아서 억지로 교체할 때
                int one = numDigit.get(length - 1);
                int dec = numDigit.get(length -2);
                numDigit.set(length-1,dec);
                numDigit.set(length-2,one);
                change--;
            }
            String result = "";
            for(int elem : numDigit){
                result += elem;
            }
            System.out.println("#"+(t+1)+" "+result);
        }
    }

    static List<Integer> findmax(List<Integer> numDigit) {
        List<Integer> sortDigit = new ArrayList<>(numDigit);
        Collections.sort(sortDigit,Collections.reverseOrder());
        return sortDigit;
    }
}
