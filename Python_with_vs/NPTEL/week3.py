def remdup(L):
    l=[]
    for i in L:
        if i not in l:
            l.append(i)
    return l

def sumsquare(L):
    oddsum=0
    evensum=0
    for i in L:
        if i%2==0:
            evensum+=i**2
        else:
            oddsum+=i**2
    return ([oddsum,evensum])

def transpose(m):
    ans=list()
    for i in range(len(m[0])):
        a=[]
        for j in range(len(m)):
            a.append(m[j][i])
        ans.append(a)
    return ans

print(remdup([3,1,3,5]))
print(remdup([7,3,-1,-5]))
print(remdup([3,5,7,5,3,7,10]))
print(sumsquare([1,3,5]))
print(sumsquare([2,4,6]))
print(sumsquare([-1,-2,3,7])	)
print(transpose([[1,2,3],[4,5,6]])	)
print(transpose([[1],[2],[3]])	)
print(transpose([[3]]))
