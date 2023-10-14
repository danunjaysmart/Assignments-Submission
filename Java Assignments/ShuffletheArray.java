package Java;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ShuffletheArray {

	public static void main(String[] args) {
		Integer[] Array= {1, 2, 3, 4, 5, 6, 7};
        List<Integer> list = Arrays.asList(Array);
        Collections.shuffle(list);
        System.out.println("Shuffled array: " + list);
		

	}

}
