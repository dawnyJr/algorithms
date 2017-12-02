

def linear_search(my_list, target_value):

    i = 0
    while i < len(my_list):
        if my_list[i] == target_value:
            return i 
        i += 1
    return -1
