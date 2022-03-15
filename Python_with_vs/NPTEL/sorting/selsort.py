def Selectionsort(l):
    for start in range(len(l)):
        minpos = start
        for i in range(start,len(l)):
            if l[i] < l[minpos]:
                minpos = i
        (l[start],l[minpos]) = (l[minpos],l[start])
    return l

n = int(input("Enter the number of elements of the array: "))
a = list(map(int,input("Enter the numbers: ").strip().split()))[:n]
a = Selectionsort(a)
print(a)