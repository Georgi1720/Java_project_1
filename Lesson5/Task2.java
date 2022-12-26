package Lesson5;

import java.util.*;

public class Task2 {
    public static void main(String[] args) {
        String[] paths = new String[]{"root/a 1.txt(abcd) 2.txt(efgh)", "root/c 3.txt(abcd)", "root/c/d 4.txt(efgh)", "root 4.txt(efgh)"};
        System.out.println(findDuplicate(paths));
    }

    public static List<List<String>> findDuplicate(String[] paths) {
        HashMap<String, List<String>> listKey = new HashMap<>();
        for (String path : paths) {
            String[] tmp = path.split(" ");
            for (int i = 1; i < tmp.length; i++) {
                String[] raw = tmp[i].split("\\(");
                String data = raw[1];
                String file = raw[0];
                if (listKey.containsKey(data)) {
                    List<String> newPath = listKey.get(data);
                    newPath.add(tmp[0] + "/" + file);
                } else {
                    List<String> dataD = new ArrayList<>();
                    dataD.add(tmp[0] + "/" + file);
                    listKey.put(data, dataD);
                }
            }
        }
        List<List<String>> result = new ArrayList<>();
        for (String key : listKey.keySet()) {
            if (listKey.get(key).size() > 1) result.add(listKey.get(key));
        }
        return result;
    }

}
