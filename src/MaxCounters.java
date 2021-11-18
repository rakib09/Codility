import java.util.Arrays;

public class MaxCounters {
    public static int[] solution(int N, int[] A) {
        int[] counters = new int[N];
        int counter = 0;
        int minVal = 0;
        for (int i = 0; i < A.length; i++) {
            if (A[i] > N) {
                minVal = counter;
            } else {
                counters[A[i]-1] = Math.max((counters[A[i]-1]+1),(minVal+1));
                if (counter < counters[A[i]-1]) {
                    counter = counters[A[i]-1];
                }
            }

        }
        for (int i = 0; i < N; i++) {
            counters[i] = Math.max(counters[i], minVal);
        }
        return counters;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution(5, new int[]{3, 4, 4, 6, 1, 4, 4})));
    }
}
