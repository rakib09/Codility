import java.util.Arrays;

public class TapeEquilibrium {
    public static int solution(int[] A) {
        int leftSum=0,rightSum = 0;
        for(int i = 0; i< (A.length); i++)
        rightSum +=A[i];
        int difference = 0;
        int maxDiff = Integer.MAX_VALUE;
        for(int i = 0; i< (A.length-1); i++) {
            leftSum +=A[i];
            rightSum -=A[i];
            difference = Math.abs(leftSum-rightSum);
            if(maxDiff > difference) maxDiff = difference;
        }
        return maxDiff;
    }

    public static void main(String[] args) {
        System.out.println(solution(new int[]{2, 3, 1, 5}));
        System.out.println(solution(new int[]{1000, 1000}));
        System.out.println(solution(new int[]{1000, -1000}));
    }
}
