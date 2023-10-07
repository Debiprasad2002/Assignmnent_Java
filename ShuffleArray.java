
// Create an array with the values (1, 2, 3, 4, 5, 6, 7) and shuffle it 

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ShuffleArray {
    public static void main(String[] args) {
        // Create an array with the values (1, 2, 3, 4, 5, 6, 7)
        Integer[] array = {1, 2, 3, 4, 5, 6, 7};

        // Shuffle the array
        List<Integer> list = Arrays.asList(array);
        Collections.shuffle(list);
        list.toArray(array);

        // Print the shuffled array
        System.out.println("Shuffled array: " + Arrays.toString(array));
    }
}
