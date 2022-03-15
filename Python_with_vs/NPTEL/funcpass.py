def square(x):
    return (x*x)
def apply(f,x,n):
    res = x
    for i in range(n):
        res = f(res)
    return res

print(apply(square,5,2))