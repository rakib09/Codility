public class FrogRiverOne {
    static int solution(int[] A, int X) {
        int[] location = new int[X+1];
        for (int i = 0; i < A.length; i++) {
            if(location[A[i]] == 0) {
                location[A[i]]=1;
                X--;
            }
            if(X == 0) return i;
        }
        return -1;
    }
    public static void main(String[] args) {
        System.out.println(solution(new int[]{1,3,1,4,3,4,4,2}, 4));
    }
}
