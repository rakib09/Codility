import java.util.HashSet;

public class PermMissingElem {
    public static int solution(int[] A) {

        HashSet<Integer> set = new HashSet<>();
        for (int i = 1; i <= (A.length+1); i++)
            set.add(i);
        for (int j : A) {
            set.remove(j);
        }
        return set.iterator().next();
    }

    public static int solution1(int[] A) {
        Long l = Long.valueOf(A.length+1);
        long sumOfAll =  l*  (l+1L)/2L;
        for (long j : A) {
            sumOfAll -= j;
        }
        return (int) sumOfAll;
    }

    public static void main(String[] args) {
        int[] A = {
                1,
                3,
                4,
                5
        };
        System.out.println(solution1(A));
    }
}
