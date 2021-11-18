import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class PermCheck {
    public static int solution(int[] A) {
        long length = A.length;
        long sum = length*(length+1l)/2l;
        Set set =  new HashSet();
        for (int i = 0; i < length; i++) {
            set.add(A[i]);
            sum-=A[i];
        }
        if (sum == 0l && set.size() == length) {
            return 1;
        } else {
            return 0;
        }
    }

    public static void main(String[] args) {
        System.out.println(solution(new int[]{4,1,3,2}));
        System.out.println(solution(new int[]{1,1,4}));
    }
}
