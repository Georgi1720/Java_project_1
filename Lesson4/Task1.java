package Lesson4;

import java.util.ArrayDeque;

public class Task1 {
    public static void main(String[] args) {
        String pat = "/../folder//dec/../c/";
        System.out.println(simplifyPath(pat));
    }
    public static String simplifyPath(String path) {
        ArrayDeque<String> result = new ArrayDeque<>();
        String[] splitLine = path.split("/",-1);
        for (String s : splitLine) {
            if (!s.equals(".") && !s.equals("..") && !s.equals("")) {
                result.add(s);
            }
            if (s.equals("..")) {
                result.pollLast();
            }
        }
        return "/"+ String.join("/", result);
    }
}
