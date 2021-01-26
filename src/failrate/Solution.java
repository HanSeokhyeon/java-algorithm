package failrate;

import java.util.Arrays;
import java.util.Comparator;

class Solution {
    public static void main(String[] args) {
        Solution solution = new Solution();
        solution.solution(5, new int[]{2,1,2,6,2,4,3,3});
    }
    public int[] solution(int N, int[] stages) {
        int[] answer = new int[N];
        double[] rate = new double[N];
        Arrays.sort(stages);

        int j = 0;
        for (int i=1; i<N+1; i++) {
            double sum = 0;
            while (stages[j] == i) {
                j++;
                sum++;
            }
            rate[i-1] = sum / (stages.length-j+sum);
        }

        return answer;
    }
}

class ArrayIndexComparator implements Comparator<Integer> {
    private final double[] array;

    public ArrayIndexComparator(double[] array) {
        this.array = array;
    }

    public Integer[] createIndexArray() {
        Integer[] indices = new Integer[array.length];
        for (int i=0; i<array.length; i++) {
            indices[i] = i+1;
        }
        return indices;
    }

    @Override
    public int compare(Integer o1, Integer o2) {
        return array[o1].compareTo(array[o2]);
    }
}