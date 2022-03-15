def Insertionsort(l):
    for sliceEnd in range(len(l)):
        pos = sliceEnd
        while pos > 0 and l[pos] < l[pos-1]:
            (l[pos],l[pos-1]) = (l[pos-1],l[pos])
            pos -= 1
    return l

n = int(input("Enter the number of elements of the array: "))
a = list(map(int,input("Enter the numbers: ").strip().split()))[:n]
a = Insertionsort(a)
print(a)