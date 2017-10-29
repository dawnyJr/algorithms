package com.algorithms.binarysearch

/**
 * Created by Sabiq Ihab on 10/28/17.
 */
class BinarySearch {

    def recursiveSearch(int value, int[] sortedArray, int start = 0, int end = sortedArray.size() - 1) {
        int m
        if (start > end) {
            return -1
        } else {
            m = (start + end) / 2
        }
        if (value == sortedArray[m]) {
            return m
        } else if (value < sortedArray[m]) {
            return recursiveSearch(value, sortedArray, start, m - 1)
        } else if (value > sortedArray[m]) {
            return recursiveSearch(value, sortedArray, m + 1, end)
        }

    }

    def search(int value, int[] sortedArray) {
        def start = 0
        def end = sortedArray.size()

        while (start < end) {
            int m = (start + end - 1) / 2
            if (value < sortedArray[m]) {
                end = m - 1
            } else if (value > sortedArray[m]) {
                start = m + 1
            } else {
                return m
            }
        }
        return -1
    }

}