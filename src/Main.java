import java.util.ArrayList;
import java.util.List;

/**
 * Given two sorted lists, find the numbers that are similar in both lists.
 * <p>
 * Example:
 * list1 = [1, 2, 3, 4, 5]
 * list2 = [4, 5, 6, 7, 8]
 * <p>
 * Output: [4, 5]
 */
public class Main {
    public static void main(String[] args) {
        List<Integer> list = List.of(1, 2, 3, 4, 5);
        List<Integer> list2 = List.of(4, 5, 6, 7, 8);

        List<Integer> result = findSimilarNumbers(list, list2);
        result.forEach(System.out::println);
    }

    /**
     * Find the numbers that are similar in both lists.
     *
     * @param list  first list
     * @param list2 second list
     * @return list of similar numbers
     */
    private static List<Integer> findSimilarNumbers(List<Integer> list, List<Integer> list2) {
        List<Integer> result = new ArrayList<>();
        int i = 0, j = 0;

        while (i < list.size() && j < list2.size()) {
            if (list.get(i).equals(list2.get(j))) {
                result.add(list.get(i));
                i++;
                j++;
            } else if (list.get(i) < list2.get(j)) {
                i++;
            } else {
                j++;
            }
        }
        return result;
    }
}