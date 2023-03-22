/**
 * @Author: Alireza Sadeghi
 * Insertion Sort
 */

package ir.ac.kntu.sorting;

import java.util.ArrayList;

/**
 * Insertion sort builds the final sorted array one item at a time by
 * comparing each element with the previous elements and
 * swapping them if they are in the wrong order.
 */
public class Insertion {
    public static void sort(ArrayList<Integer> input){
        int tmp = 0;
        for (int j = 0; j < input.size(); j++){
            for (int i = 0; i < j; i++){
                if (input.get(i) > input.get(j)){
                    tmp = input.get(j);
                    input.set(j, input.get(i));
                    input.set(i, tmp);
                }
            }
        }
    }
}
