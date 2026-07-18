import java.util.Collection;
import java.util.HashMap;

public class frequencyOfElements {

    public static void main(String[] args) {

        int[] nums = {1,1,2,2,3,3,3,4,5,6,7,7,8,9,9,0};

        Integer[] ans = frequencyOfElements(nums);

        for (int x : ans) {
            System.out.print(x + " ");
        }
    }

    public static Integer[] frequencyOfElements(int[] nums) {

        HashMap<Integer, Integer> map = new HashMap<>();

        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        Collection<Integer> values = map.values();

        return values.toArray(new Integer[0]);
    }
}