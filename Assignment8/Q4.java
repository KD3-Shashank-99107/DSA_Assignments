package Assignment8;


import java.util.HashMap;

public class Q4 {

}


class solution {
    public boolean containsDuplicate(int[] nums) {

        HashMap<Integer, Integer> map = new HashMap<>();

        for (int num : nums) {

            if (map.containsKey(num)) {
                return true;
            }

            map.put(num, 1);
        }

        return false;
    }
}