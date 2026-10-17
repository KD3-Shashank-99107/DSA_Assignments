package Assignment8;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Q1 {

}


 class WordCount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a line:");
        String str = sc.nextLine().toLowerCase();

        String[] words = str.split("\\s+");

        HashMap<String, Integer> map = new HashMap<>();

        for (String word : words) {
            map.put(word, map.getOrDefault(word, 0) + 1);
        }

        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }

        sc.close();
    }
}
