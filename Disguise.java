import java.util.HashMap;
import java.util.Iterator;

public class Disguise {
    /**
     * Programers 위장
     */
    public int solution(String[][] clothes){
        //1. classify clothes
        HashMap<String,Integer> map = new HashMap<>();

        for(String[] clothe : clothes){
            String type = clothe[1];
            map.put(type,map.getOrDefault(type,0)+1);//map can know the number of clothes
        }

        //2.add case of nothing choose
        Iterator<Integer> it = map.values().iterator();
        int answer = 1;
        while(it.hasNext()){
            answer = it.next().intValue() +1;
        }
        return answer-1;
    }

//    public static void main(String[] args){
//        Disguise sol = new Disguise();
//        String[][] clothes = {
//                {"yellowhat",":headgear"},
//                {"bluesunglasses",":eyewear"},
//                {"green_turban",":headgear"}
//        };
//        System.out.println(sol.solution(clothes));
//    }
}
