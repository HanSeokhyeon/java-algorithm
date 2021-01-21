package secretmap;

import java.lang.Math;

class Solution {
    public String[] solution(int n, int[] arr1, int[] arr2) {
        String[] answer = new String[n];
        for (int i=0; i<n; i++) {
            String line = "";
            for (int j=n-1; j>=0; j--) {
                Boolean flag = false;
                int divider = (int)Math.pow(2, j);
                if (arr1[i] >= divider) {
                    arr1[i] -= divider;
                    flag = true;
                }
                if (arr2[i] >= divider) {
                    arr2[i] -= divider;
                    flag = true;
                }
                if (flag) {
                    line += "#";
                } else {
                    line += " ";
                }
            }
            answer[i] = line;
        }
        return answer;
    }
}

