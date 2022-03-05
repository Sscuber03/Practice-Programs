def snake(m):
    l=[]
    for i in range(len(m)):
        if i%2==0:
            for j in range(len(m[0])):
                l.append(m[i][j])
        else:
            for j in range(len(m[0])-1,-1,-1):
                l.append(m[i][j])
    return l



