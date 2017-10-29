package com.algorithms.binarysearch

import org.junit.Test

/**
 * Created by Sabiq Ihab on 10/29/17.
 */
class BinarySearchTest {

    BinarySearch binarySearch = new BinarySearch()

    @Test
    void testRecursiveSearch() {
        def emptyArray = []
        assert binarySearch.recursiveSearch(100, emptyArray as int[]) == -1

        def sortedArray = [1, 2, 5, 8, 9, 10]
        assert binarySearch.recursiveSearch(-5, sortedArray as int[]) == -1
        assert binarySearch.recursiveSearch(0, sortedArray as int[]) == -1
        assert binarySearch.recursiveSearch(1, sortedArray as int[]) == 0
        assert binarySearch.recursiveSearch(5, sortedArray as int[]) == 2
        assert binarySearch.recursiveSearch(6, sortedArray as int[]) == -1
        assert binarySearch.recursiveSearch(10, sortedArray as int[]) == 5
        assert binarySearch.recursiveSearch(11, sortedArray as int[]) == -1

    }

    @Test
    void testSearch() {
        def emptyArray = []
        assert binarySearch.search(100, emptyArray as int[]) == -1

        def sortedArray = [1, 2, 5, 8, 9, 10]
        assert binarySearch.search(-5, sortedArray as int[]) == -1
        assert binarySearch.search(0, sortedArray as int[]) == -1
        assert binarySearch.search(1, sortedArray as int[]) == 0
        assert binarySearch.search(5, sortedArray as int[]) == 2
        assert binarySearch.search(6, sortedArray as int[]) == -1
        assert binarySearch.search(10, sortedArray as int[]) == 5
        assert binarySearch.search(11, sortedArray as int[]) == -1

    }

}