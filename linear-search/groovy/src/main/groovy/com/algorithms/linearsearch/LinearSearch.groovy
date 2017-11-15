package com.algorithms.linearsearch
/**
 * Class containing a linear/sequential search method
 *
 * Created by Sabiq Ihab on 11/15/17.
 */
class LinearSearch {
    /**
     * perform a linear search on array and return the index of the first element if any or -1
     *
     * @param v target value
     * @param t array
     * @return index of the value or -1
     */
    def search(int v, int[] t) {

        for (int i = 0; i < t.size(); i++) {
            if (t[i] == v)
                return i
        }
        return -1
    }
}