package Assignment8;

import java.util.HashMap;
import java.util.Map;

public class Q2 {

}


public class ModeArray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 2, 4, 2, 3, 3};

        HashMap<Integer, Integer> map = new HashMap<>();

        int maxFreq = 0;
        int mode = arr[0];

        for (int num : arr) {
            int freq = map.getOrDefault(num, 0) + 1;
            map.put(num, freq);

            if (freq > maxFreq) {
                maxFreq = freq;
                mode = num;
            }
        }

        System.out.println("Mode: " + mode);
        System.out.println("Frequency: " + maxFreq);
    }
}
