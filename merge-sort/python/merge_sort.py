
def merge_parts(left_part, right_part, array):
    """ Merge two sorted arrays in one array """
    # indexes: 'i' -> left_part, 'j' -> right_part and 'k' for array
    i = 0
    j = 0
    k = 0
    while i < len(left_part) and j < len(right_part):
        if left_part[i] <= right_part[j]:
            array[k] = left_part[i]
            i += 1
        else:
            array[k] = right_part[j]
            j += 1
        k += 1
    while i < len(left_part):
        array[k] = left_part[i]
        i += 1
        k += 1
    while j < len(right_part):
        array[k] = right_part[j]
        j += 1
        k += 1
    #print('Merging', left_part, 'and', right_part, 'into', array)

def merge_sort(array):
    """ Split array into itwo parts, sort them (merge_sort) and merge them """
    if len(array) > 1:
        middle = int(len(array) / 2)
        left_part = array[:middle]
        right_part = array[middle:]
        #print('Splitted', array, 'into:', left_part, 'and', right_part)
        merge_sort(left_part)
        merge_sort(right_part)
        merge_parts(left_part, right_part, array)
    

