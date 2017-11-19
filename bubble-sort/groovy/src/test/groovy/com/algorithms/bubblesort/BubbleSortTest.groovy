package com.algorithms.bubbleSort

import com.algorithms.bubblesort.BubbleSort
import org.junit.Test

/**
 * Created by Sabiq Ihab on 11/19/17.
 */
class BubbleSortTest {

    BubbleSort bubbleSort = new BubbleSort()

    @Test
    void testSort() {
        def emptyArray = []
        assert bubbleSort.sort(emptyArray as int[]) == []

        def sortedArray = [1, 3, 6, 7, 9, 10]
        assert bubbleSort.sort(sortedArray as int[]) == [1, 3, 6, 7, 9, 10]

        def arrayWithDuplicates = [6, 3, 3, 7, 1, 6]
        assert bubbleSort.sort(arrayWithDuplicates as int[]) == [1, 3, 3, 6, 6, 7]

        def array = [6, 3, 10, 7, 1, 9]
        assert bubbleSort.sort(array as int[]) == [1, 3, 6, 7, 9, 10]


    }
}