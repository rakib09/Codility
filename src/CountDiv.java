public class CountDiv {
    public static int solution(int A, int B, int K) {
        int baseNumber = (int) Math.ceil(((double) A / (double) K)) * K;
        B-=baseNumber;
        int count = (int) Math.floor((double) B/K);
        count++;
        return count;
    }

    public static void main(String[] args) {
        System.out.println(solution(6,11,2));
    }
}
