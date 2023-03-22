/**
 * @Author: Alireza Sadeghi
 * Bubble Sort
 */

package ir.ac.kntu.sorting;

import java.util.ArrayList;

/**
 * Bubble sort repeatedly swaps adjacent elements
 * if they are in the wrong order until the list is sorted.
 */
public class Bubble {
    public static void sort(ArrayList<Integer> input){
        int tmp = 0;
        for (int j = 0; j < input.size(); j++) {
            for (int i = 0; i < input.size() - j - 1; i++) {
                if (input.get(i) > input.get(i + 1)) {
                    tmp = input.get(i + 1);
                    input.set(i + 1, input.get(i));
                    input.set(i, tmp);
                }
            }
        }
    }
}
