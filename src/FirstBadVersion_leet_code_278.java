import java.util.HashMap;
import java.util.Map;

public class FirstBadVersion_leet_code_278 {

    public static int firstBadVersion(int n) {
        int result = n;
        int left = 0;
        int right = n;
        while (left <= right) {
            int mid = left + ((right-left)/2);
            if(isBadVersion(mid)) {
                result = mid;
                right = mid-1;
            } else {
                left = mid+1;
            }
        }
        return result;
    }

    static boolean isBadVersion(int version) {
        Map<Integer, Boolean> versions = new HashMap<>();
        versions.put(0, false);
        versions.put(1, false);
        versions.put(2, false);
        versions.put(3, true);
        versions.put(4, true);
        versions.put(5, true);
        return versions.get(version);
    }

    public static void main(String[] args) {
        System.out.println(firstBadVersion(5));
    }
}
