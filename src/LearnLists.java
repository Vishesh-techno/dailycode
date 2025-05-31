import java.util.ArrayList;
import java.util.List;

public class LearnLists {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        list.add(7);
        System.out.println(list);
        System.out.println(list.size());
        System.out.println(list.get(0));
        System.out.println(list.remove(5));
        System.out.println(list);
        System.out.println(list.remove(Integer.valueOf(1)));
        System.out.println(list);
        System.out.println(list.contains(200));

        List<Integer> list1 = new ArrayList<>();
        list1.add(1);
        list1.add(2);
        list1.add(3);
        list1.add(4);
        list1.add(5);
        list1.add(6);
        list1.add(7);
        System.out.println(list1);

        list.addAll(list1);
        System.out.println(list);

        System.out.println(list.size());

//        list.removeAll(list1);

//        list.clear();
        System.out.println(list.get(0));
        list.set(0,5);
        System.out.println(list);
        list.add(0,6);
        System.out.println(list);
    }
}
