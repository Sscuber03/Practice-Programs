def merge(a,b):  #Merge a[0:m] and b[0:n] in sorted manner
    (c,m,n,i,j) = ([],len(a),len(b),0,0)
    while i+j < m+n:
        if i==m:
            c.append(b[j])
            j += 1
        elif j==n:
            c.append(a[i])
            i += 1
        elif a[i]<=b[j]:
            c.append(a[i])
            i += 1
        elif a[i]>b[j]:
            c.append(b[j])
            j += 1
    return c

def mergesort(a,left,right):
    if right - left <= 1:
        return(a[left:right])
    else:
        mid = (left+right)//2
        l=mergesort(a,left,mid)
        r=mergesort(a,mid,right)
        return(merge(l,r))
    
a = list(range(1,10000,2)) + list(range(0,10000,2))
a = mergesort(a,0,len(a))
print(a)
