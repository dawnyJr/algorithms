package com.algorithms.linearsearch

import org.junit.Test

/**
 * Created by Sabiq Ihab on 11/15/17.
 */
class LinearSearchTest {

    LinearSearch linearSearch = new LinearSearch()

    @Test
    void testSearch() {
        def emptyArray = []
        assert linearSearch.search(100, emptyArray as int[]) == -1

        def array = [1, 5, 3, 9, 5, 10]
        assert linearSearch.search(-5, array as int[]) == -1
        assert linearSearch.search(1, array as int[]) == 0
        assert linearSearch.search(3, array as int[]) == 2
        assert linearSearch.search(6, array as int[]) == -1
        assert linearSearch.search(10, array as int[]) == 5
        assert linearSearch.search(11, array as int[]) == -1

    }
}
