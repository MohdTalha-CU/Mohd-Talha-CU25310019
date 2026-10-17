import java.util.ArrayList;
import java.util.Collections;
public class Collectionsexample {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(45);
        numbers.add(12);
        numbers.add(89);
        numbers.add(12);
        numbers.add(34);
        System.out.println("Original List: " + numbers);
        Collections.sort(numbers);
        System.out.println("Sorted List: " + numbers);
        Collections.reverse(numbers);
        System.out.println("Reversed List: " + numbers);
        System.out.println("Maximum value: " + Collections.max(numbers));
        System.out.println("Minimum value: " + Collections.min(numbers));
        System.out.println("Frequency of 12: " + Collections.frequency(numbers, 12));
    }
}