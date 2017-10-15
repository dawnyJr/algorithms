
def pascal(r, c):
    ''' The function return the corresponding value in the pascal triangle, corresponding to a given (row, column)
    Zero is the return value for a negative column or row.
    '''
    if r < 0 or c < 0:
        return 0
    elif r == c:
        return 1
    else:
        return pascal (r-1, c-1) + pascal(r-1, c)
