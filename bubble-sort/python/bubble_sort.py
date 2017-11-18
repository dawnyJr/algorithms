
def bubble_sort(array):
    """ Scan from left and bubble the larger item to the right.
        Repeat until no swaps  """
    if array is None:
        return 
    swaps = -1 
    while swaps != 0:
        i = 0
        swaps = 0
        while i < len(array) - 1:
            if array[i] > array[i+1]:
                array[i], array[i+1] = array[i+1], array[i]
                swaps += 1
            i += 1 
