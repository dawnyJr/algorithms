package com.algorithms.bubblesort

/**
 * Created by Sabiq Ihab on 11/19/17.
 */
class BubbleSort {


    def sort(int[] arr) {
        def swapped = true

        while (swapped) {
            swapped = false

            for (def i = 0; i < arr.size() - 1; i++) {
                if (arr[i] > arr[i + 1]) {
                    swap(arr, i, i + 1)
                    swapped = true
                }

            }
        }
        return arr
    }

    private def swap(int[] arr, int i, int j) {
        def temp = arr[i]
        arr[i] = arr[j]
        arr[j] = temp
    }
}
