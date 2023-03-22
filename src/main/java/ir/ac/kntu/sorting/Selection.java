/**
 * @Author: Alireza Sadeghi
 * Selection Sort
 */

package ir.ac.kntu.sorting;

import java.util.ArrayList;

/**
 * Selection sort repeatedly selects the minimum
 * element from an unsorted list and places it at the beginning of the list.
 */
public class Selection {
    public static void sort(ArrayList<Integer> input){
        int min_index = 0, min = 0, tmp = 0;

        for (int i = 0; i < input.size() - 1; i++){
            min_index = i;
            min = input.get(i);

            for (int j = i + 1; j < input.size(); j++){
                if (input.get(j) < min){
                    min_index = j;
                    min = input.get(j);
                }
            }

            tmp = input.get(min_index);
            input.set(min_index, input.get(i));
            input.set(i, tmp);
        }
    }
}
