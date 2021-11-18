import java.util.Arrays;

public class CyclicRotation {

    public static int[] solution(int[] A, int K) {
        int length = A.length;
        if(length == 0) return A;
        int[] rotateA = new int[length];
        K = K % length;
        int j = 0;
        for(int i = (length - K); i < length; i++) {
            rotateA[j] = A[i];
            j++;
        }
        for(int i = 0; i < (length-K); i++) {
            rotateA[j] = A[i];
            j++;
        }
        return rotateA;
    }

    public static void main(String[] args) {
        System.out.printf(Arrays.toString(solution(new int[]{}, 0)));
    }

}
