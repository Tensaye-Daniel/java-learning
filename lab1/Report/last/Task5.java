import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;

public class Task5 {
    public static void main(String[] args) {
        ArrayList<Integer> listWithDuplicates = new ArrayList<>(Arrays.asList(5, 1, 2, 1, 3, 2, 4, 5));

        // LinkedHashSet removes duplicates and maintains insertion order
        ArrayList<Integer> uniqueList = new ArrayList<>(new LinkedHashSet<>(listWithDuplicates));

        System.out.println("List with unique elements: " + uniqueList);
    }
}
