import math

def calc(amount: int, size: int):
    lc = math.floor(amount / (54 * size))
    amount = amount % 54 * size
    sb = math.floor(amount / (27 * size))
    amount = amount % 27 * size
    st = math.floor(amount / size)
    amount = amount % size

    return f"{lc}LC+{sb}c+{st}st+{amount}"