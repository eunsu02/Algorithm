import java.util.*;
class Solution {
    public int[] solution(int N, int[] stages) {
        //스테이지별 도전자 수
        int[] challenger = new int[N+2];
        for(int stage:stages){
            challenger[stage]+=1;
        }
        double total = stages.length;
        
        //스테이지별 실패 사용자 수
        HashMap<Integer, Double> fails=new HashMap<>();
        for(int i=1;i<=N;i++){
            if(challenger[i]==0){
                fails.put(i,0.);
            }
            else{
                fails.put(i,challenger[i]/total);
                    total-=challenger[i];
            }
        }
        return fails.entrySet().stream().sorted((o1,o2)->o1.getValue().equals(o2.getValue())?Integer.compare(o1.getKey(),o2.getKey()):Double.compare(o2.getValue(),o1.getValue())).mapToInt(HashMap.Entry::getKey).toArray();
    }
}