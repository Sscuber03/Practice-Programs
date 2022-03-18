# This program uses memoized programming, the beginning of dynamic programming

fibtable = {}
def fib(n):
    if n in fibtable.keys():
        return(fibtable[n])
    elif n==0 or n==1:
        value = n
    else:
        value = fib(n-1) + fib(n-2)
    fibtable[n] = value
    return value

print(fib(9))
