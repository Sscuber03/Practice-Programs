from re import M


def neighbours(axy):
    global n,m
    X = [2, 1, -1, -2, -2, -1, 1, 2]
    Y = [1, 2, 2, 1, -1, -2, -2, -1]
    L = []
    for i in range(8):
        x = axy[0] + X[i]
        y = axy[1] + Y[i]
        if(x>=0 and y>=0 and x<n and y<m):
            L.append((x,y))
    return L

def explore(sxy,txy):# sxy and txy are tuples containing the coordinates
    marked = [[0 for i in range(n)] for j in range(m)]
    marked[sxy[0]][sxy[1]] = 1
    queue = [sxy]
    while queue != []:
        axy = queue.pop()
        for nxy in neighbours(axy):
            if not marked[nxy[0]][nxy[1]]:
                marked[nxy[0]][nxy[1]] = 1
                queue.insert(0,nxy)
    return(marked[txy[0]][txy[1]])

n = int(input("Enter the number of rows: "))
m = int(input("Enter the number of columns: "))
p = eval(input("Enter the coordinates of starting position: "))
q = eval(input("Enter the coordinates of ending position: "))
res = explore(p,q)
if(res):
    print("It is possible!")
else:
    print("It is not possible!")

