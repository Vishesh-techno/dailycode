import javax.tools.ForwardingFileObject;
import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListExample {
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> list = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
//        list.add(1);
//        list.add(2);
//        list.add(3);
//        list.add(4);
//        list.add(5);
//        list.add(6);
//        list.add(7);
//        list.add(8);
//        System.out.println(list);
        for (int i = 0; i < 3; i++) {
            list.add(new ArrayList<>());
        }
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                list.get(i).add(sc.nextInt());
            }
        }
        System.out.println(list);
    }
}
