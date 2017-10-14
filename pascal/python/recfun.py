
def pascal(r, c):
    if r < 0 or c < 0:
        return 0
    elif r == c:
        return 1
    else:
        return pascal (r-1, c-1) + pascal(r-1, c)
