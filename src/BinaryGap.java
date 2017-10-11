import java.util.Scanner;

public class BinaryGap {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Input Number: ");
        int N = scanner.nextInt();

        System.out.println("" + solution(N));
    }

    static int solution(int N) {
        String binaryStr = Integer.toBinaryString(N);
        int i = binaryStr.length() -1;
        while (binaryStr.charAt(i) == '0') {
            i--;
        }
        int gap = 0;
        int count = 0;
        while ( i >= 0 ) {
            if(binaryStr.charAt(i) == '1') {
                gap = Math.max(gap, count);
                count = 0;
            } else {
                count++;
            }
            i--;
        }
        return gap;
    }
}
