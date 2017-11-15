package com.algorithms.linearsearch
/**
 * Created by Sabiq Ihab on 11/15/17.
 */
class LinearSearch {

    def search(int v, int[] t) {

        for (int i = 0; i < t.size(); i++) {
            if (t[i] == v)
                return i
        }
        return -1
    }
}