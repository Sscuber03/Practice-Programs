def quicksort(a,l,r):
    if r-l <= 1:
        return ()
    yellow = l+1
    for green in range(l+1,r):
        if a[green] <= a[l]:
            (a[yellow],a[green]) = (a[green],a[yellow])
            yellow += 1
    (a[l],a[yellow+1]) = (a[yellow+1],a[l])
    quicksort(a,l,yellow-1)
    quicksort(a,yellow,r)

n = int(input("Enter the number of elements of the array: "))
a = list(map(int,input("Enter the numbers: ").strip().split()))[:n]
quicksort(a,0,n)
print(a)