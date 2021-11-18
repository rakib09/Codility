public class PassingCars {
    public static int solution(int[] A) {
        int eastTravel = 0, passingCar=0;
        for (int i = 0; i < A.length; i++) {
            if(A[i] == 0) {
                eastTravel++;
            } else {
                passingCar+=eastTravel;
                if(passingCar> 1000000000) return -1;
            }
        }
        return passingCar;
    }
    public static void main(String[] args) {
        System.out.println(solution(new int[]{1, 0,1,0,1,1}));
    }
}
