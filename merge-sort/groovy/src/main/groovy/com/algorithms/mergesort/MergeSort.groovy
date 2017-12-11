package com.algorithms.mergesort

/**
 * Class containing a method for sorting array using the merge sort.
 *
 * Created by Sabiq Ihab on 12/11/17.
 */

class MergeSort {

/**
 *
 * @param list list to be sorted
 * @return sorted list 
 */
    def mergeSort(def list){

        if ( list.size() <= 1 ){
	    return list
	}

	def mid = (list.size() / 2) as int 
	def leftList = list[0..mid-1]
	def rightList = list[mid..list.size()-1]

	return merge( mergeSort(leftList) , mergeSort(rightList) )
    }

    def merge(def leftList,def rightList){

	def list = []

	def int i=0
	def int j=0

	while( i < leftList.size() && j < rightList.size() ){

	    if ( leftList[i]< rightList[j]){
	        list << leftList[i]
		i++
	    }

	    else {
		list << rightList[j]
		j++
	    }
					
	}

	while( i < leftList.size() ){
		list << leftList[i]
		i++
	}
	while( j < rightList.size() ){
		list << rightList[j]
		j++
	}

	return list
    }
}
