package intervalx;

public class Solution {
    public long[] solution(int x, int n) {
        long[] answer = new long[n];
        long longX = x;
        for (int i=1; i<n+1; i++){
            answer[i-1] = longX*i;
        }
        return answer;
    }
}