#Dynamic programming, for finding the optimal way of multiplying n number of matrices 
def MMC(R,C):
    L = [[0 for i in range(len(R))] for j in range(len(R))]
    for c in range(1,len(R)):
        for r in range(c,-1,-1):
            L[r][c] = 10000000
            for k in range(r,c):
                subprob = L[r][k] + L[k][c] + R[r]*C[k]*C[c]
                if subprob < L[r][c]:
                    L[r][c] = subprob

