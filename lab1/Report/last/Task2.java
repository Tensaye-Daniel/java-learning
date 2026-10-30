import java.util.ArrayList;
import java.util.Arrays;

public class Task2 {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>(Arrays.asList("Alice", "Bob", "Charlie"));

        // Add at the front (index 0)
        names.add(0, "Zack");

        // Add at the end
        names.add("Diana");

        // Remove the middle element
        int middleIndex = names.size() / 2;
        names.remove(middleIndex);

        System.out.println("Updated list: " + names);
    }
}
