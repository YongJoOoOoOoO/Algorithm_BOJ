import java.util.*;
class Solution {
    public ArrayList<Integer> solution(int[] arr) {
        ArrayList<Integer> answer = new ArrayList<>();
        
        for(int x : arr){
            for(int i=0; i<x; i++){
                answer.add(x);
            }
        }
        
        return answer;
    }
}