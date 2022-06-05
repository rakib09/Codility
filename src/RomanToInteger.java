import java.util.HashMap;
import java.util.Map;

public class RomanToInteger {
    public static int romanToInt(String s) {
        Map<Character, Integer> symbolMap = new HashMap<>();
        symbolMap.put('I', 1);
        symbolMap.put('V', 5);
        symbolMap.put('X', 10);
        symbolMap.put('L', 50);
        symbolMap.put('C', 100);
        symbolMap.put('D', 500);
        symbolMap.put('M', 1000);
        char[] charArray = s.toCharArray();
        int sum = 0;
        int prev = 0;
        for (int i = s.length()-1; i >= 0; i--) {
           if(symbolMap.get(charArray[i]) < prev) {
               sum -= symbolMap.get(charArray[i]);
           } else {
               sum += symbolMap.get(charArray[i]);
           }
           prev = symbolMap.get(charArray[i]);
        }
        return sum;
    }
    public static void main(String[] args) {
        System.out.println(romanToInt("MCMXCIV"));
    }
}
