#Dynamic Programming, to find the largest common word among the two string, the have to be one after the another.
def LCW(u,v):
    L = [[0 for i in range(len(v)+1)] for j in range(len(u)+1)]
    maxL = 0
    maxR = 0
    for c in range(len(v)-1,-1,-1):
        for r in range(len(u)-1,-1,-1):
            if u[r] == v[c]:
                L[r][c] = 1 + L[r+1][c+1]
            else:
                L[r][c] = 0
            if L[r][c] > maxL:
                maxL = L[r][c]
                maxR = r
    
    return maxL , u[maxR:maxR+maxL]

a = 'bisect'
b = 'secret'
print(LCW(a,b))