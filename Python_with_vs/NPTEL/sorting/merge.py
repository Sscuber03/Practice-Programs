def merge(a,b):  #Merge a[0:m] and b[0:n] in sorted manner, also if used with the last elif block, it can be used to find union of two sets
    (c,m,n,i,j) = ([],len(a),len(b),0,0)
    while i<m and j<n:
        (p,q)=(1,1)
        if i==m:
            c.append(b[j])
            j += 1
        elif j==n:
            c.append(a[i])
            i += 1
        elif a[i]<b[j]:
            c.append(a[i])
            i += 1
        elif a[i]>b[j]:
            c.append(b[j])
            j += 1
        elif a[i] == b[j]: # This elif block is to remove duplicates from the list before merging
            while(p):
                if i+2 < m:
                    if a[i] == a[i+1]:
                        i += 1
                    else:
                        p=0
                else:
                    p=0
            while(q):
                if j+2 < m:
                    if b[j] == b[j+1]:
                        j += 1
                    else:
                        q=0
                else:
                    q=0
            c.append(a[i])
            i += 1
            j += 1
    return c

def intersection(a,b):
    (d,m,n,i,j) = ([],len(a),len(b),0,0)
    while i<m and j<n:
        (p,q)=(1,1)
        if i==m:
            d.append(b[j])
            j += 1
        elif j==n:
            d.append(a[i])
            i += 1
        elif a[i]<b[j]:
            d.append(a[i])
            i += 1
        elif a[i]>b[j]:
            d.append(b[j])
            j += 1
        elif a[i] == b[j]: # This elif block is for skipping the common elements in the sets
            while(p):
                if i+2 < m:
                    if a[i] == a[i+1]:
                        i += 1
                    else:
                        p=0
                else:
                    p=0
            while(q):
                if j+2 < m:
                    if b[j] == b[j+1]:
                        j += 1
                    else:
                        q=0
                else:
                    q=0
            i += 1
            j += 1
    return d

def listdifference(a,b): # This is used to find the difference of the two seta, i.e. a-b in this case
    (e,m,n,i,j) = ([],len(a),len(b),0,0)
    while i<m and j<n:
        (p,q)=(1,1)
        if i==m:
            j += 1
        elif j==n:
            e.append(a[i])
            i += 1
        elif a[i]<b[j]:
            e.append(a[i])
            i += 1
        elif a[i]>b[j]:
            j += 1
        elif a[i] == b[j]: # This elif block is for skipping the common elements in the sets
            while(p):
                if i+2 < m:
                    if a[i] == a[i+1]:
                        i += 1
                    else:
                        p=0
                else:
                    p=0
            while(q):
                if j+2 < m:
                    if b[j] == b[j+1]:
                        j += 1
                    else:
                        q=0
                else:
                    q=0
            i += 1
            j += 1
    return e
    
a = [1,2,2,2,3,4,5,5,8,8,9]
b = [2,2,2,2,2,3,3,5,6,7,8,9,9,9]
c = merge(a,b)
print(c)
d = intersection(a,b)
print(d)
e = listdifference(a,b)
print(e)