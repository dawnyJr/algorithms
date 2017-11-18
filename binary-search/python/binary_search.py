

def recursive_binary_search(array, target_value, start=0, end=None):
    if not end:
        end = len(array) - 1
    mid = int((start + end) / 2)

    if start > end:
        return -1
    if array[mid] == target_value:
        return mid
    elif array[mid] > target_value:
        return recursive_binary_search(array, target_value, start=0, end=mid-1)
    else:
        return recursive_binary_search(array, target_value, start=mid+1, end=end)


def binary_search(array, target_value):
    start = 0
    end = len(array) - 1
    while start <= end:
        mid = int((start + end) / 2)
        if array[mid] == target_value:
            return mid
        elif array[mid] > target_value:
            end = mid - 1
        else:
            start = mid + 1
    return -1


