package ir.ac.kntu;

import ir.ac.kntu.sorting.Selection;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    private final ArrayList<Integer> input = new ArrayList<Integer>(Arrays.asList(3, 1, 5, 21, 43, 25, 17, 36, 9));
    private final ArrayList<Integer> sorted = new ArrayList<Integer>(Arrays.asList(1, 3, 5, 9, 17, 21, 25, 36, 43));
    @Test
    public void selection_test(){
        Selection.sort(input);
        Assert.assertEquals(sorted, input);
    }
}
