package com.algorithms.selectionsort

import com.algorithms.selectionsort.SelectionSort
import org.junit.Test

/**
 * Created by Sabiq Ihab on 12/09/17.
 */
class SelectionSortTest {

    SelectionSort sort = new SelectionSort()

    @Test
    void testSelectionSort() {
        def emptyArray = []
        assert sort.selectionSort(emptyArray) == []

        def sortedArray = [1, 3, 6, 7, 9, 10]
        assert sort.selectionSort(sortedArray) == [1, 3, 6, 7, 9, 10]

        def arrayWithDuplicates = [6, 3, 3, 7, 1, 6]
        assert sort.selectionSort(arrayWithDuplicates ) == [1, 3, 3, 6, 6, 7]

        def array = [6, 3, 10, 7, 1, 9]
        assert sort.selectionSort(array) == [1, 3, 6, 7, 9, 10]


    }
}
