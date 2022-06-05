import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class FizzBuzz {
    public static List<String> fizzBuzz(int n) {
        List<String> fbList = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            if(i % 3 == 0 && i % 5 ==0) {
                fbList.add("FizzBuzz");
            } else if(i % 3 == 0) {
                fbList.add("Fizz");
            } else if(i % 5 ==0) {
                fbList.add("Buzz");
            } else {
                fbList.add(i + "");
            }
        }
        return fbList;
    }

    public static void main(String[] args) {
        System.out.println(fizzBuzz(50));
    }
}
