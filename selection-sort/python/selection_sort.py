

def selection_sort(array):
    """ Find the smallest item and put it on the first position.
        Repeat for the remaining N-1 items """
    if array is None:
        return 
    start = 0 
    end = len(array) - 1
    while start < end: 
        i = start
        while i <= end:
            if array[i] < array[start]:
                array[start], array[i] = array[i], array[start]
            i += 1
        start += 1
