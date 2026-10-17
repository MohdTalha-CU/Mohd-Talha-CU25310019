import java.util.ArrayList;
import java.util.HashSet;
public class Listset {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        HashSet<Integer> set = new HashSet<>();
        int[] values = {10, 20, 30, 20, 40, 10, 50};
        for (int value : values) {
            list.add(value);
            set.add(value);
        }
        System.out.println("ArrayList: " + list);
        System.out.println("HashSet: " + set);
    }
}