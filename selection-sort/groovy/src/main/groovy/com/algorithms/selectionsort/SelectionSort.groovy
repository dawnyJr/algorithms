package com.algorithms.selectionsort

class SelectionSort {

    def selectionSort(def list){

        list.eachWithIndex{ item,index ->
		
	    def minIndex = index

	    for( def j = index + 1 ; j < list.size() ; j++){
                if( list[j] < list[minIndex] )
		    minIndex = j
	    }

	    swap(list, index, minIndex)
	}

	return list	
    }

    private def swap(def list, def i, def j) {
        def temp = list[i]
        list[i] = list[j]
        list[j] = temp
    }

}
