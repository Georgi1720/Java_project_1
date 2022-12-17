import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;


public class Lesson3 {
    public static void main(String[] args) {

        ArrayList<Integer> someList = new ArrayList<>(Arrays.asList(1, 1, 1));                     //Задача 1   true
        ArrayList<Integer> someList2 = new ArrayList<>(Arrays.asList(1, 1, 1));
        System.out.println(equalList(someList, someList2));

        ArrayList<Integer> list1 = new ArrayList<>(Arrays.asList(5, 5, 9, 8, 4, 15, 0, 5));        //Задача 2  true
        ArrayList<Integer> list2 = new ArrayList<>(Arrays.asList(5, 5, 2, 5, 4));
        System.out.println(countNumb(list1, list2, 5));

        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(10, 4, 5, 6, 7, 2, 2, 9));         //Задача 3 [2, 2, 5, 4, 7, 6, 10, 9]
        System.out.println(even(list));

        ArrayList<Integer> list3 = new ArrayList<>(Arrays.asList(0, 2, 1, 3));                     //Задача 4  [1, 3]
        System.out.println(deleteAneven(list3));
    }

    public static boolean equalList(ArrayList<Integer> someList, ArrayList<Integer> someList2) {
        if (someList.size() != someList2.size()) {
            return false;
        } else {
            for (int i = 0; i < someList.size(); i++) {
                int meaning = someList.get(i);
                int meaning2 = someList2.get(i);
                if (meaning != meaning2) {
                    return false;
                }
            }
            return true;
        }
    }

    public static boolean countNumb(ArrayList<Integer> list1, ArrayList<Integer> list2, int num) {
        int i = 0;
        int count = 0;
        int count2 = 0;
        while (i < Math.max(list1.size(), list2.size())) {
            if (i < list1.size() && list1.get(i) == num) {
                count++;
            }
            if (i < list2.size() && list2.get(i) == num) {
                count2++;
            }
            i++;
        }
        return count == count2;
    }

    public static ArrayList<Integer> even(ArrayList<Integer> list) {
        ArrayList<Integer> newlist = new ArrayList<>();
        int j = 0;
        for (Integer integer : list) {
            if (integer % 2 == 0) {
                newlist.add(integer);
            }
        }
        Collections.sort(newlist);
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) % 2 == 0) {
                list.set(i, list.get(j));
                j++;
            }
        }
        return list;
    }

    public static ArrayList<Integer> deleteAneven(ArrayList<Integer> list3) {
        list3.removeIf(integer -> integer % 2 == 0);
        return list3;
    }
}

