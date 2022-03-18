#Dynamic programming to find the largest common substring of the two words, where substring may not be one after the another
def LCS(u,v):
    L = [[0 for i in range(len(v)+1)] for j in range(len(u)+1)]
    for c in range(len(v)-1,-1,-1):
        for r in range(len(u)-1,-1,-1):
            if u[r] == v[c]:
                L[r][c] = 1+L[r+1][c+1]
            else:
                L[r][c] = max(L[r][c+1] , L[r+1][c])
    return(L[0][0])

a = 'bisect'
b = 'secret'
print(LCS(a,b))