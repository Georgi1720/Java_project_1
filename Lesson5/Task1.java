package Lesson5;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;


public class Task1 {
    public static void main(String[] args) {
        String[] words1 = new String[]{"smcomxxvtsotqngxxldyoxo", "tcxfeznjsgsquqklenphloveasywmv", "kfxvwpnwyffaxgibcxwtgcxddo",
                "wvivfkgkheryfqx", "umjmsgcrzo", "ikbvacrj", "bdzbzrdbyumsptuetevnhzwgb"};
        String[] words2 = new String[]{"l", "uvmgfwmgtwbmgrd", "kfxvwpnwyffaxgibcxwtgcxddo", "wvivfkgkheryfqx", "umjmsgcrzo"};
        System.out.println(countWords(words1, words2));

    }

    public static int countWords(String[] words1, String[] words2) {
        if (words1.length > words2.length) {
            return countWords(words2, words1);
        }
        HashMap<String, Integer> map = new HashMap<>();
        for (String word : words1) {
            map.putIfAbsent(word, 0);
            map.put(word, map.get(word) + 1);
        }

        for (String word : words2) {
            if (map.containsKey(word) && map.get(word) <= 1) {
                map.put(word, map.get(word) - 1);
            }
        }
        int count = 0;
        for (String word : map.keySet()) {
            if (map.get(word) == 0) {
                count++;
            }
        }
        return count;
    }
}