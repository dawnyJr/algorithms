package com.algorithms.mergesort

import com.algorithms.mergesort.MergeSort
import org.junit.Test

/**
 * Created by Sabiq Ihab on 12/09/17.
 */
class MergeSortTest {

    MergeSort mergeSort = new MergeSort()

    @Test
    void testMergeSort() {
        def emptyArray = []
        assert mergeSort.mergeSort(emptyArray) == []

        def sortedArray = [1, 3, 6, 7, 9, 10]
        assert mergeSort.mergeSort(sortedArray) == [1, 3, 6, 7, 9, 10]

        def arrayWithDuplicates = [6, 3, 3, 7, 1, 6]
        assert mergeSort.mergeSort(arrayWithDuplicates ) == [1, 3, 3, 6, 6, 7]

        def array = [6, 3, 10, 7, 1, 9]
        assert mergeSort.mergeSort(array) == [1, 3, 6, 7, 9, 10]


    }
}
