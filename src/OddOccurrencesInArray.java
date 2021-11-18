import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;

public class OddOccurrencesInArray {

    public static void main(String[] args) {
        int A[] = {7, 9,3,9,3,9,9};
        System.out.println("" + solution(A));
    }

    static int solution(int[] A) {
        HashSet<Integer> set = new HashSet<Integer>(A.length/2);

        for(int i = 0; i < A.length; i++) {
            if (set.contains(A[i])) {
                set.remove(A[i]);
            } else {
                set.add(A[i]);
            }
        }
        return set.toArray(new Integer[set.size()])[0];
    }
}
