import java.util.ArrayList;
import java.util.List;

public class StreamFindSingleElement {
    public static void main(String[] args) {
        List<String> list = new ArrayList<String>();
        list.add("Hello");
        list.add("How");
        String result = list.stream().filter(k->  "How".equals(k)).findAny().orElse("");
        System.out.println(result);
    }
}
