package com.algorithms.binarysearch

/**
 * Class containing two methods performing a binary search on a sorted array, one using the recursive approach and the other using the iterative approach.
 *
 * Created by Sabiq Ihab on 10/28/17.
 */
class BinarySearch {
/**
 * find a value in a sorted array.
 *
 * @param value the value being search for in the array.
 * @param sortedArray array where to look for the value, must be sorted.
 * @param start optional argument to specify the index on the left of the array, default 0.
 * @param end optional argument to specify the index on the right of the array, default size of the array minis 1.
 * @return if the value is found its position is returned else it returns -1.
 */
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
/**
 * find a value in a sorted array.
 *
 * @param value the value being search for in the array.
 * @param sortedArray array where to look for the value, must be sorted.
 * @return if the value is found its position is returned else it returns -1.
 */
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