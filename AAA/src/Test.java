import java.util.AbstractList;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.HashMap;

public class Test {
    public static void main(String[] args) {
        LinkedList<String> list1 = new LinkedList<>();
        list1.add("1");
        list1.add("2");
        list1.add("3");
        LinkedList<String> list2 = new LinkedList<>();
        list2.add("1");
        list2.add("2");
        list2.add("3");
        AbstractList<String> list = new ArrayList<>();
        list.add("a");
        list.add("b");
        list.add("c");
        System.out.println("+-----------------+");
        System.out.println("| id | name | age |");
        for (int i=0;i<3;i++) {
            System.out.println("+-----------------+");
            System.out.println("|" +list1.get(i)+"|" +list.set(i,"") + "|"+list2.get(i)+"|");
        }
        System.out.println("+-----------------+");
    }
}