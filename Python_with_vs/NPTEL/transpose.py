def Transpose(m):
    R=[[m[j][i] for j in range(len(m))] for i in range(len(m[0]))]
    return R
    
n = int(input())
M=[]
for i in range(n):
    L = list(map(int,input().split()))
    M.append(L)
print(Transpose(M))