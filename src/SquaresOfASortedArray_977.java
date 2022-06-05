import java.util.Arrays;

public class SquaresOfASortedArray_977 {
    public static int[] sortedSquares(int[] nums) {
        int n = nums.length;
        int left = 0, right = n-1, i=n-1;
        int[] result = new int[n];
        while (i >= 0) {
            if(nums[left] * nums[left] > nums[right]* nums[right]) {
                result[i--] = nums[left] * nums[left];
                left++;
            } else {
                result[i--] = nums[right] * nums[right];
                right--;
            }
        }
        return result;
    }
    public static void main(String[] args) {
        System.out.println(Arrays.toString(sortedSquares(new int[]{-4,-1,0,3,10})));
    }
}
