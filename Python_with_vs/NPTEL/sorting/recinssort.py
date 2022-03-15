# import sys

# sys.setrecursionlimit(10000)   this is used to set the recursion limit from around 1000 to anything we like, but a value must be given

# insertion sort is usually better than selection sort

def Insertionsort(l):
    isort(l,len(l))
    

def isort(l,k):
    if k>1:
        isort(l,k-1)
        insert(l,k-1)

def insert(l,k):
    pos = k
    while pos > 0 and l[pos] < l[pos-1]:
        (l[pos],l[pos-1]) = (l[pos-1],l[pos])
        pos -= 1
   
l = list(range(997,0,-1))
Insertionsort(l)
print(l)     
# n = int(input("Enter the number of elements of the array: "))
# a = list(map(int,input("Enter the numbers: ").strip().split()))[:n]
# Insertionsort(a)
# print(a)
